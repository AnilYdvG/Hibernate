package com.anil.a2;

public class MainCasting 
{
	public static void main(String[] args) {
		System.out.println("Main mtd started");
		
//		DemoCasting d = (DemoCasting) new DemoCasting1();
//		
////		Subclass type casted to super class  ---> Up casting
////		1.Object is created for Subclass DemoCasting1
////		2.Subclass(DemoCasted1) to super class(DemoCasted)
////		3.After conversion assigned to super class reference variable
////		DemoCasting1 starts behaving like DemoCasting
//		
//		System.out.println("x value is "+d.x);
//		d.disp();
//		
		DemoCasting d1 = (DemoCasting) new DemoCasting2();
//		DemoCasting2 is casted to DemoCasting
		System.out.println("x :"+d1.x);
		d1.disp();
		
//		
//		DemoCasting1 d2 = (DemoCasting1) new DemoCasting2();
////		DemoCasting2 is casted to DemoCasting1
		
		
		DemoCasting2 d4 = new DemoCasting2();
		
		DemoCasting1 d5 = d4;
		
		DemoCasting d6 = d4;
		
		
		
		System.out.println("Main mtd ended");
	}

}
