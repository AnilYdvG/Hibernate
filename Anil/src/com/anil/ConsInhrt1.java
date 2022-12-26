package com.anil;

public class ConsInhrt1 				//if a class is declared as final then it cant be super class bt it can be sub class
										//If a variable is declared as final then it will work as constant that cant be re-initialised or cant be re-declared.

{
	ConsInhrt1()				//first execute this constructor.
	{
		System.out.println("Running ConsInhrt1 constructor");
	}
	

}
class ConsInhrt2 extends ConsInhrt1
{
	int a=17;
	ConsInhrt2()				//Constructor ConsInhrt2 will call ConsInhrt1 constructor.
	{
		System.out.println("Running ConsInhrt2 constructor");
	}
}
class ConsInhrt3 extends ConsInhrt2
{
	String name="Consinhrt3";
	ConsInhrt3()				//Constructor ConsInhrt3 will call ConsInhrt2
	{
		System.out.println("Running ConsInhrt3 constructor");
	}
}