package loosecoupling;

import java.util.Scanner;

interface MainPymentGateway
{
	void pay();
}

class GooglePay implements MainPymentGateway
{
	@Override
	public void pay()
	{
		System.out.println("Pay using Gpay");
	}
}

class PayTm implements MainPymentGateway
{
	@Override
	public void pay()
	{
		System.out.println("Pay using PayTm");
	}
}

class PhonePe implements MainPymentGateway
{
	@Override
	public void pay()
	{
		System.out.println("Pay using PP");
	}
}

class Customer
{
    static MainPymentGateway paymentGateway;   //null
	Customer(MainPymentGateway paymentGateway)
	{
		this.paymentGateway=paymentGateway;
	}
}


class MainPayment 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
//		GooglePay gpay = new GooglePay();
//		PayTm paytm = new PayTm();
//		PhonePe phonepe = new PhonePe();
		
		System.out.println("Press \n 1--> gpay \n 2--> paytm \n 3--> Phonepe");
		int n= sc.nextInt();
		if(n==1)
		{
//			Customer customer = new Customer(gpay);
//			customer.paymentGateway.pay();
			
			new Customer(new GooglePay());
		}
		else if(n==2)
		{
//		Customer customer = new Customer(paytm);
//		customer.paymentGateway.pay();
			
			new Customer(new PayTm());
		}
		else if(n==3)
		{
//			Customer customer = new Customer(phonepe);
//			customer.paymentGateway.pay();
			
			new Customer(new PhonePe());
		}
//		else System.out.println("Wrong choice");
		
		sc.close();
		if(Customer.paymentGateway!=null)
		{
			Customer.paymentGateway.pay();
		}
		else System.err.println("Wrong choice");
	}


}
