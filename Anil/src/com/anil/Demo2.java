package com.anil;

public class Demo2 implements Demo1
{
	public void m1()
	{
		System.out.println("hi");
	}
	public static void main(String[] args) 
	{
		Demo2 d2 = new Demo2();
		d2.m1();
		System.out.println(d2.x);
	}
}
 