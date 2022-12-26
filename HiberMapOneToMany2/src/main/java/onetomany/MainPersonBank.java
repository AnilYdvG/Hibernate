package onetomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Persistence;

@Entity
class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String Name;
	private String Address;

	@OneToMany
	List<Bank> bank;

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

	public List<Bank> getBank() {
		return bank;
	}

	public void setBank(List<Bank> bank) {
		this.bank = bank;
	}

	public String toString() {
		return "Id: " + id + "\n Name: " + Name + "\n Address: " + Address + "\n Bank Details: \n " + bank;
	}
}

@Entity
class Bank {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String B_Name;
	private String B_Branch;
	private String B_accNo;
	private String IFSC;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getB_Name() {
		return B_Name;
	}

	public void setB_Name(String b_Name) {
		B_Name = b_Name;
	}

	public String getB_Branch() {
		return B_Branch;
	}

	public void setB_Branch(String b_Branch) {
		B_Branch = b_Branch;
	}

	public String getB_accNo() {
		return B_accNo;
	}

	public void setB_accNo(String b_accNo) {
		B_accNo = b_accNo;
	}

	public String getIFSC() {
		return IFSC;
	}

	public void setIFSC(String iFSC) {
		IFSC = iFSC;
	}

	public String toString() {
		return "ID: " + id + "\n Bank Name: " + B_Name + "\n Account No: " + B_accNo + "\n IFSC: " + IFSC
				+ "\n Branch: " + B_Branch;
	}

}

public class MainPersonBank {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Hibernate");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

	}
}
