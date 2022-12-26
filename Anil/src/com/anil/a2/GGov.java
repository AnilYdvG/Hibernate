package com.anil.a2;

public class GGov 
{
	//Generalisation
	//services
	void AadharEnroll(GPerson arg1)
	{
		System.out.println("Enrolling "+arg1.Name+" for Aadhar");
	}
		//Specialisation
	void Schlorship(GStudent arg1)
	{
		if(arg1.marks>80)
		{
			System.out.println(arg1.Name+" is eligible for schlorship");
		}
		else
		{
			System.out.println(arg1.Name+" is not eligible for schlorship");
		}
	}
		//Specialisation
	void TaxPayment(GEmployee arg1)
	{
		if(arg1.Salary>500000.0)
		{
			System.out.println(arg1.Name+" is eligible for tax");
		}
		else
		{
			System.out.println(arg1.Name+" is not eligible for tax");
		}
	}

}
