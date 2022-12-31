package mobile;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MainAndroid {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 1;
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Hibernate");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		while (n == 1) {
			Android a = new Android();
			System.out.println("Id:\tBrand: \tColor: \tPrice: \tModel;");
			a.setId(sc.nextInt());

			a.setBrand(sc.next());

			a.setColor(sc.next());

			a.setPrice(sc.nextDouble());

			a.setModel(sc.next());

			et.begin();
			em.persist(a);
			et.commit();

			System.out.println("Data added");

			System.out.println("Press 1 to add another data \nPress any other number to exit");
			n = sc.nextInt();
		}
		sc.close();
		System.out.println("Thank u for wasting ur time here");
	}
}
