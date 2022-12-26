package com.anil.a2;

public class VMainClass 
{
	public static void main(String[] args) 
	{
		VBicycle bi1 = new VBicycle();
		VBike b1 = new VBike();
		VCar c1 = new VCar();
		VVehicleSimulator s1 = new VVehicleSimulator();
		System.out.println("Bicycle simulation");
		s1.drive(bi1);
		System.out.println("=====================");
		System.out.println("Bike Simulation");
		s1.drive(b1);
		System.out.println(".....................");
		System.out.println("Car simulation");
		s1.drive(c1);
		
	}

}
