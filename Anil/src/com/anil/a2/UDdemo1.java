package com.anil.a2;

public class UDdemo1 
{
	int x=100;
	void test()
	{
		System.out.println("Running test() mtd");
	}
}

class UDdemo2 extends UDdemo1
{
	int y=200;
	void disp()
	{
		System.out.println("Running disp() mtd");
	}
}

class UDdemo3 extends UDdemo1
{
	int z=300;
	void view()
	{
		System.out.println("Running view() mtd");
	}
}
