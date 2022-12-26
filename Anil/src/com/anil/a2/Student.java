package com.anil.a2;

public class Student extends Person
{
	String USN;
	double marks;
	String clgName;
	
	public Student(String name,char gender,int age,String USN,double marks,String clgName) 		
	{
		super(name,gender,age);		//Constructor chaining
		this.USN = USN;
		this.marks = marks;
		this.clgName = clgName;
		
	}
	void details()			//Mtd Overloading
	{
		System.out.println("Name: "+name+",\t Gender: "+gender+",\t Age: "+age+
									",\t USN: "+USN+",\t marks: "+marks+",\t clgName: "+clgName);
	}
	

}
