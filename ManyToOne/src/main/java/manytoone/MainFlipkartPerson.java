package manytoone;

import java.util.Scanner;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Persistence;

@Entity
class FlipkartOrder
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String OrderName;
	private String OrderStatus;
	private double Cost;
	
	@ManyToOne
	private Person person;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOrderName() {
		return OrderName;
	}

	public void setOrderName(String orderName) {
		OrderName = orderName;
	}

	public String getOrderStatus() {
		return OrderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		OrderStatus = orderStatus;
	}

	public double getCost() {
		return Cost;
	}

	public void setCost(double cost) {
		Cost = cost;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	public String toString()
	{
		return "FLIPKART DETAILS:\n OrderID: "+id+"\n OrderName: "+OrderName+"\n OrderStatus: "+OrderStatus+"\n Cost: "+Cost+"\n Person Details: \n"+person;
	}
	
}


@Entity
class Person
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String Name;
	private String Address;
	private long PhNo;
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
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public long getPhNo() {
		return PhNo;
	}
	public void setPhNo(long phNo) {
		PhNo = phNo;
	}
	public String toString()
	{
		return "PersonId: "+id+"\n Name: "+Name+"\n Address: "+Address+"\n PhNo: "+PhNo;
	}
	
	
}

public class MainFlipkartPerson 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Hibernate");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		int i=1;
		while(i==1)
		{
		
			System.out.println("Enter 3 data for FLIPKART \n OrderName: \t Cost: \t OrderStatus: ");
			
			
			FlipkartOrder f1 = new FlipkartOrder();
			f1.setOrderName(sc.next());
			f1.setCost(sc.nextDouble());
			f1.setOrderStatus(sc.next());

			FlipkartOrder f2 = new FlipkartOrder();
			f2.setOrderName(sc.next());
			f2.setCost(sc.nextDouble());
			f2.setOrderStatus(sc.next());
			

			FlipkartOrder f3 = new FlipkartOrder();
			f3.setOrderName(sc.next());
			f3.setCost(sc.nextDouble());
			f3.setOrderStatus(sc.next());
		
			
			
			Person p = new Person();
			System.out.println("Enter CUSTOMER data \n Name: \t PhNo: \t Address: ");
			p.setName(sc.next());
			p.setPhNo(sc.nextLong());
			p.setAddress(sc.next());
			
			f1.setPerson(p);
			f2.setPerson(p);
			f3.setPerson(p);
			
			et.begin();
			em.persist(f1);
			em.persist(f2);
			em.persist(f3);
			em.persist(p);
			et.commit();
			
			System.out.println("Data saved successfully \n press 1 to add other data \n press any other number to exit");
			i=sc.nextInt();
			
			
		}
		sc.close();
		System.out.println("Thanks!!!");
		
	}

}

class FetchFlipkartPerson
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Hibernate");
		EntityManager em = emf.createEntityManager();
		
		int i=1;
		while(i==1)
		{
			int n=1;
			System.out.println("Press 1 to fetch one by one \n Press 2 to fetch whole data");
			n=sc.nextInt();
			if(n==1)
			{
				System.out.println("Enter id u want to get the data of");
				n=sc.nextInt();
				FlipkartOrder f1 =em.find(FlipkartOrder.class, n);
				if(f1!=null)
				{
					System.out.println(f1);
					
				}
				else
				{
					System.out.println("Data not available");
					break;
				}
				System.out.println("Press 1 to fetch another data \n Press 2 to fetch whole table \n Press any other number to exit");
				i=sc.nextInt();
			}
			else if(n==2)
			{
				while(i>=1)
				{
					FlipkartOrder f1 = em.find(FlipkartOrder.class, i);
					if(f1!=null)
						System.out.println(f1);
					else break;
					i++;
				}
			}
		}
		sc.close();
		System.out.println("Thanks!!!");
	}
	
}


class UpdateFlipKartPerson
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Hibernate");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		int i=1;
		while(i>=1)
		{
			FlipkartOrder f = em.find(FlipkartOrder.class, i);
			
			if(f!=null)
				{
				System.out.println(f);
				}
			else
				break;
			i++;
		}
		System.out.println("Press 1 to update FlipKart data \n Press 2 to Update Customer details");
		i=sc.nextInt();
		if(i==1)
		{
			System.out.println("Enter the ID in Flipkart to Update");
			int n=sc.nextInt();
			while(i==1)
			{
				FlipkartOrder f = em.find(FlipkartOrder.class, n);
				System.out.println("Press below mentioned key to update: \n 1--> OrderName \n 2-->OrderStatus \n 3-->Cost ");
				n=sc.nextInt();
				if(f!=null)
				{
					
				}
			}
		}
	}
}






















