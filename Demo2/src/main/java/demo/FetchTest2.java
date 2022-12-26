package demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FetchTest2 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("uday");
		EntityManager em = emf.createEntityManager();
		int i=1;
		while(i>=1)
		{
			
			Test t = em.find(Test.class, i);
			if(t!=null)
			{
				System.out.println("\n-----------\nId: "+t.getId()+"\nName: "+t.getName()+"\nPercentage: "+t.getPercentage()+"\n---------------");
				
			}
			else
			{
				break;
			}
			i++;
		}
	}
}
