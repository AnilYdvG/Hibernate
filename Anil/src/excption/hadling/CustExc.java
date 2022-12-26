package excption.hadling;

import java.util.Scanner;

public class CustExc 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Amount");
		double amount = s.nextDouble();
		double balance = 50000;
		CustInSufficientFundException I = new CustInSufficientFundException("Insufficient fund");
		if(amount<=balance)
			System.out.println("Withdrawl successful");
		else 
		{
			try 
			{
				throw I;
			}
			catch(CustInSufficientFundException e)
			{
				System.out.println("Enter lesser amount");
				System.out.println(e.getMessage());
//				e.printStackTrace();		//to get the information of exception
			}
		}
	}
}
