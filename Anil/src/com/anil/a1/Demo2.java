package com.anil.a1;

public class Demo2 {
	
	public static void main(String[] args) {
		
	Demo1 d=new Demo1();
	
//	System.out.println("a is "+d.a);		//cant access pvt variable
	System.out.println("b is "+d.b);
	System.out.println("c is "+d.c);
	System.out.println("d is "+d.d);
	System.out.println("----------");
	d.disp();
	}
}
	
