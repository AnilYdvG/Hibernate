package com.anil.a1;

public class EncapsSol 
{
	public static void main(String[] args) {
		System.out.println("-------------------------");
		Encaps e1=new Encaps(1234,"Ramesh",25000.00);
		System.out.println("Employee name is :"+e1.getName());
		System.out.println("Employee ID :"+e1.getId());
		System.out.println("Employee salary:"+e1.getSalary());
		System.out.println("Updating Salary");
		
		e1.setSalary(35000.50);
		System.out.println("Employee Salary :"+e1.getSalary());
		
		
		System.out.println("**************************");
		
	}

}
