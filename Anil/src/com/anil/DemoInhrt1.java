package com.anil;

public class DemoInhrt1
{
	int x=100;

}
class DemoInhrt2 extends DemoInhrt1
{
	int x=200;				//DemoInhrt2 contains two x variables with same variable name
	void disp()
	{
		int x=300;
		System.out.println("local variable x is "+x);
		System.out.println("Sub class instance variable x is "+this.x);
		System.out.println("Super class variable x is "+super.x);			//use super. keyword to show the inherited value of x
	}
}
