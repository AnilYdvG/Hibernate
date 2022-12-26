package com.anil.a1;

public interface IntrfcDemo 		//super interface
{
	int var1=100;		//by default--it is PUBLIC,STATIC & FINAL
	void disp();			//by default--it is PUBLIC & ABSTRACT
	void test();
}

//IMPLEMENTATION

abstract class Sample implements IntrfcDemo		//Sample is known as "IMPLEMENTATION CLASS" of Demo1---Sample is-a implementation of IntrfcDemo
{			//providing partial implementation
	public void disp()			//given public AS cz in class java type,default AS is default
	
	{
		System.out.println("disp() mtd implemented in sample class");
	}
}
class Sample3 extends Sample			
{			//fully implementation class for IntrfcDemo interface
	public void test()
	{
		System.out.println("test() mtd implemented in Sample1 class");
	}
}
