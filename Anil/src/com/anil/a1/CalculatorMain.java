package com.anil.a1;

public class CalculatorMain 
{
	public static void main(String[] args) {
		
		System.out.println("Main mehtod started");
		MLoadingCalculator c1 = new MLoadingCalculator();
		c1.square(10);
		c1.square(5.5);
		c1.sum(10, 35);
		c1.sum(36, 45, 20);
		
		Demo3 d3 = new Demo3();			//method overloading is happening in sub class demo3
		d3.test();
		d3.test(10);
		System.out.println("Main method ended");
	}

}
