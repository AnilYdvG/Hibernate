package com.anil.a2;

public class ADemoMainClass 
{
	public static void main(String[] args) 
	{
		ADemo2 d2 = new ADemo2();
		ADemo3 d3 = new ADemo3();
		ADemo1 d1 = d2.test();		//getting ADemo1 class object form test mtd
		
		d2.show(d1);
		d2.show(d3);			//Implicit upcasting in show method
		System.out.println("x value is: "+d3.x);
		System.out.println("y value is: "+d3.y);
		
	}

}
