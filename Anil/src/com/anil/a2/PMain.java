package com.anil.a2;

public class PMain 
{
	public static void main(String[] args) 
	{
		PDemo1 d2=new PDemo1();
		PDemo ref1=d2.test();		// object of PDemo class is returned from the test() mtd-->>type matching
		System.out.println("ref value is: "+ref1);
		System.out.println("x value is: "+ref1.x);
		ref1.disp();
	}

}
