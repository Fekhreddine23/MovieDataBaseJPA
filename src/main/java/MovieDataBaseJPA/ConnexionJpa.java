package MovieDataBaseJPA;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ConnexionJpa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// Créer une instance d’entityManagerFactory
				// Créer une instance d’entityManager
				EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("moviesdatabase");
				EntityManager em = entityManagerFactory.createEntityManager();

				EntityTransaction transaction = em.getTransaction();

				transaction.begin();
				
				transaction.commit();


	}

}
