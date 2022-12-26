package demo;

import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MainTest2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n =1;
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("uday");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		
		
		while(n==1)
		{
			Test t = new Test();
			System.out.println("Id:<space> Name:<space> Percentage:");
			int id = sc.nextInt();
			t.setId(id);
			
//			System.out.println("Name:");
			t.setName(sc.next());
			
//			System.out.println("Percentage:");
			double percentage=sc.nextDouble();
			t.setPercentage(percentage);
		
				et.begin();
				em.persist(t);
				et.commit();
				
				System.out.println("Data saved in Table");
				
				System.out.println("Press 1 to add other entity \npress any other value to exit");
				n = sc.nextInt();
		}
		System.out.println("Thank u for entering data ");
		sc.close();
		
	}
}

