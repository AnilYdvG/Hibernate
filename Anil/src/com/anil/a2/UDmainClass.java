package com.anil.a2;

public class UDmainClass 
{
	public static void main(String[] args) 
	{
		UDdemo1 d1 = new UDdemo1();
		UDdemo2 d2 = new UDdemo2();
		UDdemo3 d3 = new UDdemo3();
		
		UDsample s1 = new UDsample();
		
		s1.useObject(d1);
		//passing the object of UDdemo2 class
		s1.useObject(d2);		//upcasted to UDdemo1 type
		//passing the object of UDdemo3 class
		s1.useObject(d3);		//upcasted to UDdemo1 type
		
		
	}

}
