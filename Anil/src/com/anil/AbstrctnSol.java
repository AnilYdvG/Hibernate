package com.anil;

public class AbstrctnSol 
{
	public static void main(String[] args) {
		Bus b = new Bus();
		System.out.println("No. of wheels in bus are :"+b.getnoofwheels());
		
		Auto a = new Auto();
		System.out.println("No. of wheels in Auto are :"+a.getnoofwheels());
		
		Car c = new Car();
		System.out.println("No. of wheels in Car are :"+c.getnoofwheels());
	}

}
