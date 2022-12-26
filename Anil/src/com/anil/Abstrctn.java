package com.anil;

abstract class Abstrctn 			//Abstraction means not complete or partial
{
	public abstract int getnoofwheels();	//by declaring method as abstract,child class must hv to provide implementation
}
class Bus extends Abstrctn
{
	public int getnoofwheels()
	{
		return 6;				//child class can't skip the implementation
	}
}
class Auto extends Abstrctn
{
	public int getnoofwheels()
	{
		return 3;
	}
}
class Car extends Abstrctn
{
	public int getnoofwheels()
	{
		return 4;
	}
}
