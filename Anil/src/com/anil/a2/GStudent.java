package com.anil.a2;

public class GStudent extends GPerson
{
	int Rollno;
	double marks;
	String clgName;
	GStudent(String Name,int Age,char Gender,int Rollno,double marks,String clgName)
	{
		super(Name,Age,Gender);
		this.Rollno=Rollno;
		this.marks=marks;
		this.clgName=clgName;
	}
}
