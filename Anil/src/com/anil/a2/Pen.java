package com.anil.a2;

public class Pen 
{
	String Brand;
	String color;
	double price;
	String model;
	 Pen(String Brand,String color,double price,String model)
	{
		this.Brand=Brand;
		this.color=color;
		this.price=price;
		this.model=model;
	}
	void details()
	{
		System.out.println("Pen Brand is: "+Brand+", color is: "+color+", Price is:Rs "+price
						+" and model is: "+model);
		
	}

}
