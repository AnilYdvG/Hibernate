package com.anil.a2;

public class ADemo1 
{
	int x=200;
	void disp()
	{
		System.out.println("Running disp() mtd");
	}
}

class ADemo3 extends ADemo1
{
	int y=100;
	void view()
	{
		System.out.println("Running view() mtd");
	}
}
