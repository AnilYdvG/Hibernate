package com.laptop;

import java.util.Scanner;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Persistence;

@Entity
class Lapi 
{
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		Brand = brand;
	}
	public String getColour() {
		return Colour;
	}
	public void setColour(String colour) {
		Colour = colour;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="Laptop_Name")
	private String Name;
	@Column(name="Laptop_Brand")
	private String Brand;
	@Column(name = "color")
	private String Colour;
	@Column(name ="Cost")
	private double price;
}

public class MainLapi
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Hibernate");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et =em.getTransaction();
		
int n =1;
		
		while(n==1)
		{
			LapTop l2 = new LapTop();
			System.out.println("Give the data for laptop \n __________________________--");
			System.out.println("Name: \t Brand: \t Color: \t Price");
			l2.setName(sc.next());
			l2.setBrand(sc.next());
			l2.setColour(sc.next());
			l2.setPrice(sc.nextDouble());
			
			System.out.println("Data added successfully,\nPress 1 to add one more data\nPress any other number to exit ");
			n=sc.nextInt();
			
			et.begin();
			em.persist(l2);
			et.commit();
		}
		sc.close();
		System.out.println("Thank u for adding data");
		
		
		
	}
}
