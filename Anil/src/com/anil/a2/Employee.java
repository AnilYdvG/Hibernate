package com.anil.a2;

public class Employee extends Person 
{

	String id;
	double salary;
	String designation;
	
	Employee(String name,char gender,int age,String id,double salary,String designation)		//not given any AS,
																			//so it will take the AS same as of class i.e. public
	{
		super(name,gender,age);		//Constructor chaining
		this.id = id;
		this.salary = salary;
		this.designation = designation;
	}
	void details()			//method overloading
	{
		System.out.println("Name: "+name+",\t Gender: "+gender+",\t Age: "+age+
									",\t id: "+id+",\t salary: "+salary+",\t Designation: "+designation);
	}
	
}
