package com.laptop;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MainLaptop2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Hibernate");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		int n =1;
		
		while(n==1)
		{
			LapTop l1 = new LapTop();
			System.out.println("Give the data for laptop \n __________________________--");
			System.out.println("Name: \t Brand: \t Color: \t Price");
			l1.setName(sc.next());
			l1.setBrand(sc.next());
			l1.setColour(sc.next());
			l1.setPrice(sc.nextDouble());
			
			System.out.println("Data added successfully,\nPress 1 to add one more data\nPress any other number to exit ");
			n=sc.nextInt();
			
			et.begin();
			em.persist(l1);
			et.commit();
		}
		sc.close();
		System.out.println("Thank u for adding data");
		
		
	}

}
