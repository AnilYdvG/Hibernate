package com.anil.a2;

public class UDsample 
{
	void useObject(UDdemo1 arg1)
	{
		System.out.println("Running useObject() mtd");
		System.out.println("x value is: "+arg1.x);
		arg1.test();
		System.out.println("---------------------");
		
		
		if(arg1 instanceof UDdemo2)
		{
			System.out.println("Object passed as UDdemo2 class");
			UDdemo2 ref1 = (UDdemo2) arg1;
			System.out.println("y value is: "+ref1.y);
			ref1.disp();
			System.out.println("x value is: "+ref1.x);
			ref1.test();
			System.out.println("======================");
		}
		else if(arg1 instanceof UDdemo3)
		{
			System.out.println("Object passed as UDdemo3 class");
			UDdemo3 ref2 = (UDdemo3) arg1;
			System.out.println("z value is: "+ref2.z);
			ref2.view();
			System.out.println("x value is: "+ref2.x);
			ref2.test();
		}
		
	}
}
