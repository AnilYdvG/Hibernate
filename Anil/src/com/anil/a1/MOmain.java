package com.anil.a1;

public class MOmain 
{
	public static void main(String[] args) {
		System.out.println("Main method started");
		
		MOSub m = new MOSub(); //sub class object
		m.test();			//run sub class implementation
		
		MOriding m1 = new MOriding();		//super class object
		m1.test();			//run sub class implementation
		
		MOSub m2 = new MOSub(); //sub class object
		m2.test(25);		//overloading 
		
		
		System.out.println("Main method ended");
	}

}
