package lc;

import java.util.Scanner;

class Mobile 
{
	public static void main(String[] args) 
	{
		Customer customer = new Customer();

		Scanner sc = new Scanner(System.in);
		System.out.println("Press \n 1-->Ola \n 2--> Uber");
		customer.setCab(sc.nextInt());
		sc.close();
		if(customer.cab != null)
			customer.cab.travel();
		else System.err.println("INVALID CHOICE");

	}

}
