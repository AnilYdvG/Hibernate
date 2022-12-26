package com.anil.a2;

public class PenMainClass 
{
	public static void main(String[] args) 
	{
		PenCompany c1 = new PenCompany();
		Pen p2 = c1.ManufacturePen("Reynolds", "Blue", 7.5, "Jetter");
		p2.details();
		
		Pen p3 = c1.ManufacturePen("Pentonic", "Black", 10.5, "B-RT");
		p3.details();
		
		Pen p4 = c1.ManufacturePen("Link", "Red", 50.5, "Signeta");
		p4.details();
		
	}

}
