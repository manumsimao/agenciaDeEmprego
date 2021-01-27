package agenciaDeEmprego;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.agenciaDeEmprego.modelo.Produto;

public class TestarInsert {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("lanchonetepu");
		EntityManager manager = factory.createEntityManager();
		
		Produto produto = new Produto();
		produto.setNome("Refrigerante");
		produto.setPreco(4);
		
		manager.getTransaction().begin();
		manager.persist(produto);
		manager.getTransaction().commit();
		
		manager.close();
		factory.close();
	}

}
