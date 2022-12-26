package demo;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeletTest 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("uday");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		int n=1;
		int id;
		while(n==1)
		{
			System.out.println("--------------------------\nGive Id to delete the row \n-------------------------");
			id=sc.nextInt();
			Test t = em.find(Test.class, id);
			if(t!=null)
			{
			et.begin();
			em.remove(t);
			et.commit();
			}
			else
				System.out.println("------------------------------\nData not available \n----------------------------------");
			System.out.println("Press 1 to delete other row \nPress any other number to exit \n----------------------------------");
			n=sc.nextInt();
		}
		sc.close();
		System.out.println("Thank u for doing the changes");
	}

}
