package com.anil.a1;

public abstract class Abstrct1 
{
	int var1=10;
	static int var2 = 25;
	
	Abstrct1()
	{
		System.out.println("Running consturctor");
	}
	
	static void test()
	{
		System.out.println("Running Static mtd");
	}
	
	void demo()		
	{
		System.out.println("Running instance concrete mtd");
	}
	
	abstract void demo1();
	abstract void disp();
}

abstract class Sample1 extends Abstrct1
{
	void demo1()
	{
		System.out.println("demo1() abstract mtd in SAMPLE2 sub class");
	}
}

class Sample2 extends Sample1
{
	void disp()
	{
		System.out.println("disp() abstract mtd is defined in SAMPLE3 sub CLASS");
	}
}