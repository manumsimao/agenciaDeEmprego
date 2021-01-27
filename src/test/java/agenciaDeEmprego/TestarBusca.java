package agenciaDeEmprego;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.agenciaDeEmprego.modelo.Usuario;

public class TestarBusca {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("lanchonetepu");
		EntityManager manager = factory.createEntityManager();
		
		Usuario usuario = manager.find(Usuario.class, "admin");
		System.out.println(usuario.getSenha());
		
		manager.close();
		factory.close();
	}

}
