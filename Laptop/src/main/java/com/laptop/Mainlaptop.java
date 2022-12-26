package com.laptop;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Mainlaptop 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Hibernate");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		LapTop l1 = new LapTop();
		
		l1.setBrand("Asus");
		l1.setColour("Black");
		l1.setName("Anils asus");
		l1.setPrice(2500000);
		
		et.begin();
		em.persist(l1);
		et.commit();
		
	}

}
