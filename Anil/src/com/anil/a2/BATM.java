package com.anil.a2;

public class BATM 
{
	void withdraw(BDebitCard c1,double amount)
	{
		System.out.println("Withdrawing amt: "+amount);
		
		if(amount<=c1.balance)
		{
			c1.balance-=amount;
			System.out.println("Withdrawl successful");
		}
		else
		System.out.println("Failed: insufficient fund");
	}

}
