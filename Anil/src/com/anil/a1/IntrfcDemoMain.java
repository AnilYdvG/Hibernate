package com.anil.a1;

public class IntrfcDemoMain 
{
	public static void main(String[] args) {
		System.out.println("Main mtd started");
		
		Sample3 s = new Sample3();
		
		s.disp();
		s.test();
		System.out.println(IntrfcDemo.var1);		//static variable should be call in static way only
											
		System.out.println("Main mtd ended");
	}

}
