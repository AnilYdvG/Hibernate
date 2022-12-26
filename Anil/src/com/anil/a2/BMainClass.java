package com.anil.a2;

public class BMainClass 
{
	public static void main(String[] args) 
	{
		BDebitCard dc = new BDebitCard(45000.5,"suresh");
		BATM a1 = new BATM();
		System.out.println("Balance in ur account: "+dc.balance);
		a1.withdraw(dc, 12000.0);
		System.out.println("Amount left in ur account: "+dc.balance);
	}
}
