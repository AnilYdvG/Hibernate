package com.laptop;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateLaptop 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Hibernate");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		
		int s=1;
		int t=2;
		while(t==2) 
		{
		LapTop l1= em.find(LapTop.class, s);
		if(l1!=null)
			System.out.println("-------------------------\nId: "+l1.getId()+"\n Brand: "+l1.getBrand()+"\n Color: "+l1.getColour()+"\n Name: "+l1.getName()+"\n Price: "+l1.getPrice()+"\n------------------------------");
		else break;
		s++;
		}
		System.out.println("=========================");		
		
		int n=0;
		int i =1;
		while(i==1)
		{
			System.out.println("Enter Id to change the values");
			i = sc.nextInt();
			LapTop l1 = em.find(LapTop.class, i);
			
			if(l1!=null)
			{
				System.out.println("------------------------------\nID: "+l1.getId()+"\t Brand: "+l1.getBrand()+"\t Color: "+l1.getColour()+"\t Price: "+l1.getPrice()+"\t Name: "+l1.getName()+"\n--------------------------------");
				System.out.println("press below mentioned number to change values \n-------------------------------\n1-->Brand \n2--->Name \n3--->color \n4--->Price \n------------------------------------");
				n=sc.nextInt();
				if(n==1)
				{
//					l1.setId(l1.getId());
					System.out.println("Updated Brand:");
					l1.setBrand(sc.next());
//					l1.setColour(l1.getColour());
//					l1.setName(l1.getName());
//					l1.setPrice(l1.getPrice());
				}
				else if(n==2)
				{
//					l1.setId(l1.getId());
//					l1.setBrand(l1.getBrand());
//					l1.setColour(l1.getColour());
					System.out.println("Updated Name:");
					l1.setName(sc.next());
//					l1.setPrice(l1.getPrice());
				}
				else if(n==3)
				{
//					l1.setId(l1.getId());
//					l1.setBrand(l1.getBrand());
					System.out.println("Updated Color:");
					l1.setColour(sc.next());
//					l1.setName(l1.getName());
//					l1.setPrice(l1.getPrice());
				}
				else if(n==4)
				{
//					l1.setId(l1.getId());
//					l1.setBrand(l1.getBrand());
//					l1.setColour(l1.getColour());
//					l1.setName(l1.getName());
					System.out.println("Updated Price:");
					l1.setPrice(sc.nextDouble());
				}
				else
				{
					System.out.println("Invalid number \n press valid number");
					n=sc.nextInt();
				}
				et.begin();
				em.merge(l1);
				et.commit();
			}
			else
				System.out.println("Invalid Id");
			
			System.out.println("Press 1 to update other data \n press any other number to exit");
			i=sc.nextInt();
			
		}
		sc.close();
		System.out.println("Thanks!!!");
		
	}

}
