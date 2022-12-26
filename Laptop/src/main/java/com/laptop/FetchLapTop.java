package com.laptop;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FetchLapTop 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Hibernate");
		EntityManager em = emf.createEntityManager();
		
		int n= 1;
		System.out.println("Press 1 to fetch data one by one \nPress 2 to fetch complete table");
		int t=sc.nextInt();
		if(t==1)
		{
		while(n==1)
		{
			System.out.println("ID for which u want the data");
			int i=sc.nextInt();
			
			LapTop l3 = em.find(LapTop.class, i);
		if(l3 !=null)
			System.out.println("------------------------\nId: "+l3.getId()+"\n Brand: "+l3.getBrand()+"\n Color: "+l3.getColour()+"\n Name: "+l3.getName()+"\n Price: "+l3.getPrice()+"\n--------------------------------");
		
		else
			System.out.println("Data is not available");
		
		System.out.println("Press 1 to fectch other data \n Press any the number to exit");
		n=sc.nextInt();
		}
		}
		else if(t==2)
		{
			int s=1;
			
			while(t==2) 
			{
			LapTop l1= em.find(LapTop.class, s);
			if(l1!=null)
				System.out.println("-------------------------\nId: "+l1.getId()+"\n Brand: "+l1.getBrand()+"\n Color: "+l1.getColour()+"\n Name: "+l1.getName()+"\n Price: "+l1.getPrice()+"\n------------------------------");
			else break;
			s++;
			
			}
		}
		sc.close();
		System.out.println("Thanks!!");
		
		
		
	}
}
