package com.Android;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MainMobile 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Hibernate");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et =em.getTransaction();
		
		Mobile mob = new Mobile();
		mob.setName("Iphone");
		mob.setRam("8GB");
		mob.setPrice(25000.63);
		mob.setCamera("108MP");
		mob.setStorage("512GB");
		mob.setColor("Black");
		
		et.begin();
		em.persist(mob);
		et.commit();
		
		
	}

}
