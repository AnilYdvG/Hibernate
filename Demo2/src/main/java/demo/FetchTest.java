package demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FetchTest 
{

	public static void main(String[] args) 
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("uday");
		EntityManager em = emf.createEntityManager();
		
		Test t = em.find(Test.class, 1);
		
		if(t!=null)
		{
			System.out.println("Id: "+t.getId()+"\t Name: "+t.getName()+"\t Percentage: "+t.getPercentage());
			
		}
		else
		{
			System.out.println("Data is not available");
		}
		
	}

}

