package onetoone;

import java.util.Scanner;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Persistence;

@Entity
class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private long phno;
	private String email;

	@OneToOne
	private Pan pan;

	public Pan getPan() {
		return pan;
	}

	public void setPan(Pan pan) {
		this.pan = pan;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPhno() {
		return phno;
	}

	public void setPhno(long phno) {
		this.phno = phno;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String toString() {
		return "Person Details: \n ID: " + id + "\n Name: " + name + "\n PhNo: " + phno + "\n email: " + email
				+ "\n Pan details: " + pan;
	}

}

@Entity
class Pan {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String address;
	private String PanNumber;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPanNumber() {
		return PanNumber;
	}

	public void setPanNumber(String panNumber) {
		PanNumber = panNumber;
	}

	public String toString() {
		return "\nId: " + id + "\n Address: " + address + "\n Pan_Number: " + PanNumber;
	}

}

public class MainPersonPan {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Hibernate");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		int n = 1;
		while (n == 1) {
			System.out.println(
					"---------------------------\nEnter data for Pan\n--------------------- \nAddress: \t PanNumber\n");

			Pan p = new Pan();
			p.setAddress(sc.next());
			p.setPanNumber(sc.next());

			System.out.println(
					"\n-------------------------\nEnter Person data\n-------------------------------\nEmail: \tName: \tPhNo: \n");
			Person p1 = new Person();
			p1.setEmail(sc.next());
			p1.setName(sc.next());
			p1.setPhno(sc.nextLong());

			p1.setPan(p);

			System.out.println(
					"\n-----------------------\nData saved successfully \n Press 1 to add more data \n press any other number to exit\n------------------------\n");
			n = sc.nextInt();

			et.begin();
			em.persist(p);
			em.persist(p1);
			et.commit();

		}
		sc.close();
		System.out.println("\n----------------------\nThanks!!");

	}
}

class FetchPersonPan {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Hibernate");
		EntityManager em = emf.createEntityManager();

		int n = 1;
		System.out.println("Press 1 to get data by id \n Press 2 for getting whole data\n--------------------------\n");
		int t = sc.nextInt();
		if (t == 1) {
			while (n == 1) {
				System.out.println("Enter Id to get the data\n---------------------");
				int i = sc.nextInt();
				Person p1 = em.find(Person.class, i);
				Pan p2 = em.find(Pan.class, i);
				if (p1 != null && p2 != null) {
					System.out.println("\n--------------------\nPerson details:\n Id:" + p1.getId() + "\n Name: "
							+ p1.getName() + "\n email: " + p1.getEmail() + "\n phNo: " + p1.getPhno()
							+ "\n\nPan details:\nAddress: " + p2.getAddress() + "\n PanNumber: " + p2.getPanNumber()
							+ "\n---------------------------\n");

				} else
					System.out.println(
							"\n----------------------------\nData not available\n------------------------------");

				System.out.println("Press 1 to fetch another data \nPress any other number to exit");
				n = sc.nextInt();

			}
		} else if (t == 2) {
			int s = 1;

			while (t == 2) {
				Person p1 = em.find(Person.class, s);
				Pan p2 = em.find(Pan.class, s);
				if (p1 != null && p2 != null)
					System.out.println("\n--------------------\nPerson details:\n Id:" + p1.getId() + "\n Name: "
							+ p1.getName() + "\n email: " + p1.getEmail() + "\n phNo: " + p1.getPhno()
							+ "\n\nPan details:\nAddress: " + p2.getAddress() + "\n PanNumber: " + p2.getPanNumber()
							+ "\n---------------------------\n");

				else
					break;
				s++;

			}
		}
		sc.close();
		System.out.println("\n-----------------------------\nThanks!!");
	}
}

class FetchPersonPan2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Hibernate");
		EntityManager em = emf.createEntityManager();

		int i = 1;
		while (i == 1) {
			System.out.println("press 1 to fetch id wise \n press 2 to get whole data");
			int n = sc.nextInt();
			switch (n) {
			case 1:

				System.out.println("Enter id");
				int s = sc.nextInt();
				Person p = em.find(Person.class, s);
				System.out.println(p);
				break;

			case 2:

				int m = 1;
				while (m >= 1) {

					Person p1 = em.find(Person.class, m);
					if (p1 != null) {
						System.out.println(p1);
						m++;
					} else
						break;
				}

				break;

			default:
				System.out.println("Enter proper input");

			}
			System.out.println("Press 1 to fetch again\n press any other number to exit");
			i = sc.nextInt();

		}
		sc.close();
		System.out.println("Thanks!!!");
	}
}

class UpdatePersonPan {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Hibernate");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		int i = 1;
		while (i >= 1) {
			Person p1 = em.find(Person.class, i);
			if (p1 != null) {
				System.out.println(p1);
				i++;
			} else
				break;

		}
		int i1 = 1;
		while (i1 == 1) {

			System.out.println("Enter Person Id u want to update");
			i1 = sc.nextInt();
			Person p2 = em.find(Person.class, i1);

			if (p2 != null) {
				System.out.println(p2);
				System.out.println(
						"\n--press below mentioned number to change values\n--\n 1-->Name \n 2-->PhNo \n 3-->email \n--\n For Pan update--> press 4");
				int n = sc.nextInt();
				if (n == 1) {
					System.out.println("Updated Name:");
					p2.setName(sc.next());
				} else if (n == 2) {
					System.out.println("Updated PhNo:");
					p2.setPhno(sc.nextLong());
				} else if (n == 3) {
					System.out.println("Updated email");
					p2.setEmail(sc.next());

				} else if (n == 4) {

					Pan p3 = em.find(Pan.class, i1);
					if (p3 != null) {
						System.out.println("Press\n 5--->Address \n 6-->Pan_number");
						n = sc.nextInt();
						if (n == 5) {
							System.out.println("Updated Address");
							p3.setAddress(sc.next());
						} else if (n == 6) {
							System.out.println("Updated Pan Number");
							p3.setPanNumber(sc.next());
						} else {
							System.err.println("Invalid Input");
							break;
						}
					}

				} else {
					System.out.println("Invalid Input");
					break;
				}
				System.out.println("press 1 to update another value \n Press any other key to exit");
				i1 = sc.nextInt();

				et.begin();
				em.merge(p2);
				et.commit();

			} else {
				System.out.println(
						"Id not available \n Enter proper id \n Press 1 to continue update \n press any other to exit");
				i1 = sc.nextInt();
			}
		}
		sc.close();
		System.out.println("Thanks!!");
	}
}

class RemovePersonPan {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Hibernate");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		int i = 1;
		while (i >= 1) {
			Person p1 = em.find(Person.class, i);
			if (p1 != null) {
				System.out.println(p1);
				i++;
			} else
				break;
		}

		System.out.println("Press 1 to delete data one by one \n Press 2 to Delete whole data");
		int n = sc.nextInt();
		if (n == 1) {
			int i1 = 1;
			while (i1 == 1) {
				System.out.println("Enter ID to delete data");
				i1 = sc.nextInt();
				Person p2 = em.find(Person.class, i1);
				Pan p3 = em.find(Pan.class, i1);
				if (p2 != null && p3 != null) {
					et.begin();
					em.remove(p2);
					em.remove(p3);
					et.commit();
					System.out.println(
							"Data deleted successfully \n Press 1 to delete another data \n any other number to exit");
					i1 = sc.nextInt();
				} else
					break;
			}
		} else if (n == 2) {
			System.out.println(
					"You r deleting whole data!! \n You will not be able get it back \n Press 1 to confirm deleting \n Press any other number to exit");
			int i2 = 1;
			int i1 = sc.nextInt();
			while (i1 == 1) {
				Person p3 = em.find(Person.class, i2);
				et.begin();
				em.remove(p3);
				et.commit();

				i2++;
			}
			System.out.println("Whole data deleted successfully");
		}
		sc.close();
		System.out.println("Thanks!!!");
	}
}
