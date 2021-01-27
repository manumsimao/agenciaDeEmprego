package agenciaDeEmprego;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.agenciaDeEmprego.modelo.Produto;

public class TestarDelete {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("lanchonetepu");
		EntityManager manager = factory.createEntityManager();
		
		Produto produto = manager.find(Produto.class, 1);
		
		manager.getTransaction().begin();
		manager.remove(produto);
		manager.getTransaction().commit();
		
		
		manager.close();
		factory.close();
	}

}
