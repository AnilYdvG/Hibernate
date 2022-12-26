package demo;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateTest 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("uday");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et =em.getTransaction();
		
		int n=0;
		int i=1;
		while(i==1)
		{
			System.out.println("Enter the Id of which u want to change the data");
			int id= sc.nextInt();
			Test t =em.find(Test.class,id);
			if(t!=null)
			{
				
				System.out.println("Press 1 for Name \nPress 2 for Percentage");
				n=sc.nextInt();
				if(n==1)
				{
					System.out.println("ID:"+t.getId()+"\tName: "+t.getName()+"\t Percentage: "+t.getPercentage());
					t.setId(t.getId());
					System.out.println("Enter modified Name");
					t.setName(sc.next());
					t.setPercentage(t.getPercentage());

					System.out.println("Name modified");
				}
				else if(n==2)
				{
					System.out.println("ID:"+t.getId()+"\tName: "+t.getName()+"\t Percentage: "+t.getPercentage());
					t.setId(t.getId());
					t.setName(t.getName());
					System.out.println("Enter modified percentage");
					t.setPercentage(sc.nextDouble());
					System.out.println("Percentage modified");

				}		
				else
				{
					System.out.println("Invalid number");					n=sc.nextInt();
				}
				et.begin();
				em.merge(t);
				et.commit();
			}
			else
			{
				System.out.println("Invalid ID");
			}
				
				
				System.out.println("Press 1 to update any other data \nPress any other number to exit");
				i=sc.nextInt();
		}
		sc.close();
		System.out.println("Thanks for wasting time");
	}
}
