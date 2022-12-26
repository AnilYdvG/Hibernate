package com.anil.a1;

public class InhritncSol 
{
	public static void main(String[] args) 
	{
		System.out.println("Main method Started");
		Inhritnc1 i1=new Inhritnc1();
		System.out.println("x value is "+i1.x);
		i1.test();
		
		System.out.println("-------------------");
//		accessing own properties
		Inhritnc2 i2= new Inhritnc2();
		System.out.println("own y value is "+i2.y);
		i2.disp();
		System.out.println("--------------------");
		
//		accessing inherit properites
		System.out.println("after inheritance -inheriting the properties from inhritnc1 class to inhritnc2 class");
		System.out.println("means inhritnc2 class is-a type of inhritnc1 class");
		Inhritnc2 i4=new Inhritnc2();
		System.out.println("Inherited x value is "+i4.x);
		System.out.println(("own y value is "+i4.y));
		i4.disp();
		i4.test();
		
//		accessing inherited properties
		System.out.println("-------------");
		Inhritnc3 i3 = new Inhritnc3();
		System.out.println("Inhrited x values is "+i3.x);
		System.out.println("Inhrited y values is "+i3.y);
		System.out.println("z values is "+i3.z);
		i3.disp();
		i3.test();
		i3.view();
		
		
		System.out.println("Main method Ended");
		
	}

}
