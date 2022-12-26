package demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MainTest 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("uday");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Test t = new Test();
		t.setId(2);
		t.setName("Jerry");
		t.setPercentage(35.96);
		
		et.begin();
		em.persist(t);
		et.commit();
		
	}

}
