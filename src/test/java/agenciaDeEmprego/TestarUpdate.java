package agenciaDeEmprego;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.agenciaDeEmprego.modelo.Usuario;

public class TestarUpdate {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("lanchonetepu");
		EntityManager manager = factory.createEntityManager();
		
		Usuario usuario = new Usuario();
		usuario.setLogin("maria");
		usuario.setSenha("1234");
		
		manager.getTransaction().begin();
		manager.merge(usuario);
		manager.getTransaction().commit();
		
		manager.close();
		factory.close();
	}

}
