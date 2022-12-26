package com.anil.a2;

public class DemoCast2 
{
	void disp(DemoCast1 arg)
	{
		System.out.println("Running disp() mtd");
		System.out.println("x value: "+arg.x);
		System.out.println("y value is: "+arg.y);
		
		arg.test();
		
		arg.x=150;
		arg.y=250;
		System.out.println("updated x value: "+arg.x);
		System.out.println("updated y value: "+arg.y);
	}

}
