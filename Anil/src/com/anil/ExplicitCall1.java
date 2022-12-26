package com.anil;

public class ExplicitCall1 {
	
	ExplicitCall1()				//first execute this constructor.
	{
		System.out.println("Running ConsInhrt1 constructor");
	}
	

}
class ExplicitCall2 extends ExplicitCall1
{
	ExplicitCall2(int arg1)				//Constructor ExplicitCall2 will call ExplicitCall1 constructor IMPLICITLY
	{
		System.out.println("Running ConsInhrt2 constructor");
		System.out.println("arg1 value is"+arg1);
	}
}
class ExplicitCall3 extends ExplicitCall2
{
	int a=22;
	ExplicitCall3()				
	{
		super(20);		//explicit call=======one constructor--one super calling statement only   &&&& only 
		System.out.println("Running ConsInhrt3 constructor");
	}

}
