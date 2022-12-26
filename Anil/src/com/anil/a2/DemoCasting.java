package com.anil.a2;

public class DemoCasting 
{
	int x=10;
	void disp()
	{
		System.out.println("Running disp() mtd");
	}
}

class DemoCasting1 extends DemoCasting
{
	int y = 20;
	void test()
	{
		System.out.println("Running test() mtd");
	}
}
class DemoCasting2 extends DemoCasting1
{
	char z = 'A';
	void view()
	{
		System.out.println("Running view() mtd");
	}
	
}
