package onetomany;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Persistence;
import javax.swing.GroupLayout.Alignment;

@Entity
class Mobile {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String MName;
	private double MCost;

	@OneToMany
	private List<Sim> sim;

	public List<Sim> getSim() {
		return sim;
	}

	public void setSim(List<Sim> sim) {
		this.sim = sim;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMName() {
		return MName;
	}

	public void setMName(String mName) {
		MName = mName;
	}

	public double getMCost() {
		return MCost;
	}

	public void setMCost(double mCost) {
		MCost = mCost;
	}

	public String toString() {
		return "Mobile details:\n Mobile ID: " + id + " \n MobileName: " + MName + "\n MobileCost: " + MCost
				+ "\n Sim details:\n" + sim;
	}

}

@Entity
class Sim {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private long phno;
	private String ServiceProvider;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getPhno() {
		return phno;
	}

	public void setPhno(long phno) {
		this.phno = phno;
	}

	public String getServiceProvider() {
		return ServiceProvider;
	}

	public void setServiceProvider(String serviceProvider) {
		ServiceProvider = serviceProvider;
	}

	public String toString() {
		return "Id:" + id + " \n PhNo: " + phno + "\n Service Provider: " + ServiceProvider + "\n";
	}

}

public class MainMobSim {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Hibernate");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		int n = 1;
		while (n == 1) {
			System.out.println("Enter values for Mobile \n---\n Name: \t Cost:");
			Mobile m = new Mobile();
			m.setMName(sc.next());
			m.setMCost(sc.nextDouble());

			System.out.println("Enter values for Sim1 \n---\n Phno: \t Service_Provider:");

			Sim s1 = new Sim();
			s1.setPhno(sc.nextLong());
			s1.setServiceProvider(sc.next());

			System.out.println("Enter values for Sim2 \n---\n Phno: \t Service_Provider:");

			Sim s2 = new Sim();
			s2.setPhno(sc.nextLong());
			s2.setServiceProvider(sc.next());

			List<Sim> sims = new ArrayList<Sim>();
			sims.add(s1);
			sims.add(s2);

			m.setSim(sims);

			et.begin();
			em.persist(m);
			em.persist(s1);
			em.persist(s2);
			et.commit();

			System.out.println(
					"\n--- \nData saved successfully \n --\n Press 1 to add one more data \n --- \n Press any other number to exit");
			n = sc.nextInt();

		}
		sc.close();
		System.out.println("Thanks!!!");
	}

}

class FetchMobSim {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Hibernate");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		System.out.println("Press 1 to fetch data id wise \n Press 2 to fetch all data");
		int n = sc.nextInt();
		if (n == 1) {
			int i = 1;
			while (i == 1) {
				System.out.println("Enter id to fetch data");
				i = sc.nextInt();
				Mobile m1 = em.find(Mobile.class, i);
				if (m1 != null) {
					System.out.println(m1);
					System.out.println("Press 1 to fetch another data \n Press any other number to exit");
					i = sc.nextInt();

				} else {
					System.out.println("Data not available");
					System.out.println("Press 1 to fetch another data \n Press any other number to exit");
					i = sc.nextInt();
				}
			}
		} else if (n == 2) {
			int i = 1;
			while (i >= 1) {
				Mobile m1 = em.find(Mobile.class, i);
				if (m1 != null)
					System.out.println(m1);

				else
					break;
				i++;
			}
		}
		sc.close();
		System.out.println("Thanks!!");
	}
}

class RemoveMobSim {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Hibernate");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		int n = 1;
		while (n >= 1) {
			Mobile m = em.find(Mobile.class, n);
			if (m != null)
				System.out.println(m);
			else
				break;
			n++;
		}

		System.out.println("Enter 1 to delete data Id wise \n Press 2 to Delete complete table");
		int i = sc.nextInt();
		if (i == 1) {
			while (i >= 1) {
				Mobile m1 = em.find(Mobile.class, i);
//				int s1 = m1.getSim()

			}
		}

	}
}
