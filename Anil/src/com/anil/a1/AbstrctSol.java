package com.anil.a1;

public class AbstrctSol 
{
	public static void main(String[] args) {
		System.out.println("Main mtd started");
		
		System.out.println(Abstrct1.var2);
		Abstrct1.test();
		
//		Abstrct1 a = new Abstrct();			//can't create object of abstract class
		//to create object,create one non abstract class n inherit properties of abstract class
		
//		System.out.println("After creating one non abstract class n inheriting super class");
//		Sample1 s = new Sample1();
//		System.out.println("Instance vairable is "+s.var1);
//		s.demo();
//		s.demo1();
		
		
		Sample2 s1 = new Sample2();
		System.out.println(s1.var1);
		s1.disp();
		s1.demo();
		s1.demo1();
	
		
		
		
		System.out.println("Main mtd ended");
	
	}

}
