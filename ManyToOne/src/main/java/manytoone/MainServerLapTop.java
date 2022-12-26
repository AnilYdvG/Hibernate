package manytoone;

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
class Laptops
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String Brand;
	private String Model;
	
	@ManyToOne
	private Server server;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return Brand;
	}

	public void setBrand(String brand) {
		Brand = brand;
	}

	public String getModel() {
		return Model;
	}

	public void setModel(String model) {
		Model = model;
	}

	public Server getServer() {
		return server;
	}

	public void setServer(Server server) {
		this.server = server;
	}
	
	public String toString()
	{
		return "Laptop details: \n Id: "+id+"\n Brand: "+Brand+"\n Model: "+Model+"\n Server details: "+server;
	}
	
}


@Entity
class Server
{
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getS_Name() {
		return S_Name;
	}
	public void setS_Name(String s_Name) {
		S_Name = s_Name;
	}
	public String getIP() {
		return IP;
	}
	public void setIP(String iP) {
		IP = iP;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String S_Name;
	private String IP;
	
	public String toString()
	{
		return "ID: "+id+"\n S_Name: "+S_Name+"\n IP: "+IP;
	}
}


public class MainServerLapTop 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Hibernate");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Laptops l1 = new Laptops();
		l1.setBrand("DEll");
		l1.setModel("i5");
		
		Laptops l2 = new Laptops();
		l2.setBrand("DEll");
		l2.setModel("i5");
		
		Laptops l3 = new Laptops();
		l3.setBrand("DEll");
		l3.setModel("i5");
		
		Server s = new Server();
		s.setIP("131:252:I12");
		s.setS_Name("Google");
		
		l1.setServer(s);
		l2.setServer(s);
		l3.setServer(s);
		
		et.begin();
		em.persist(s);
		em.persist(l3);
		em.persist(l2);
		em.persist(l1);
		et.commit();
		
	}

}


class FetchServerLaptop
{
	public static void main(String[] args) 
	{
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Hibernate");
		EntityManager em = emf.createEntityManager();
		
		Laptops l = em.find(Laptops.class, 1);
		System.out.println(l);
		Laptops l1 = em.find(Laptops.class, 2);
		System.out.println(l1);
		Laptops l2 = em.find(Laptops.class, 3);
		System.out.println(l2);
		
	}
}

class UpdateServerLaptop
{
	public static void main(String[] args) 
	{
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Hibernate");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Laptops l1 = em.find(Laptops.class, 2);
		l1.setBrand("Asus");
		l1.setModel("i7");
		
		Laptops l2 = em.find(Laptops.class, 3);
		l2.setBrand("Acer");
		l2.setModel("i5");
		
		et.begin();
		em.merge(l1);
		em.merge(l2);
		et.commit();
		
	}
}

class RemoveServerLaptop
{
	public static void main(String[] args) 
	{

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Hibernate");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		

		Laptops l1 = em.find(Laptops.class, 2);
		
		et.begin();
		em.remove(l1);
		et.commit();	
		
	}
}











