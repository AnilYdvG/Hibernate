package com.anil.a1;

public class MOriding 
{
//	instance method
	void test()
	{
		System.out.println("test() defined in SUPER class");
		
	}
	
}
class MOSub extends MOriding
{
	void test()			//mtd overriding
	{
		System.out.println("test() defined in SUB class");
	}
	
	void test(int a)			//mtd overloading 
	{
		System.out.println("overloading test() defined in SUB class");
	}
}
