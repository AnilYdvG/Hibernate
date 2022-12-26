package com.anil.a2;

public class ADemo2 
{
	ADemo1 test()
	{
		System.out.println("Running test() mtd");
		return new ADemo1();
	}
	
	void show(ADemo1 arg1)
	{
		System.out.println("x value: "+arg1.x);
		arg1.disp();
	}

}
