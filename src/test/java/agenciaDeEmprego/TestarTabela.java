package agenciaDeEmprego;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestarTabela {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("lanchonetepu");
		EntityManager manager = factory.createEntityManager();
		
		// executa a operação
		
		manager.close();
		factory.close();

	}

}
