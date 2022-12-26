package com.anil.a2;

public class GEmployee extends GPerson
{
	int Id;
	String Designation;
	double Salary;
	GEmployee(String Name,int Age,char Gender,int Id,double Salary,String Designation)
	{
		super(Name,Age,Gender);
		this.Id=Id;
		this.Designation=Designation;
		this.Salary=Salary;
	}

}
