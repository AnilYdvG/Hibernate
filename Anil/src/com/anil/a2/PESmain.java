package com.anil.a2;

public class PESmain 
{
	public static void main(String[] args) {
		System.out.println("Main method started");
		
		Person p = new Person("Ramesh",'M',25);
		
		Employee e = new Employee("Suresh",'M',24,"abe123",55000,"ASE");
		
		Student s = new Student("Sukh",'F',22,"JSP152",99.99,"JSPABc");
		
		p.details();
		
		e.details();
		
		s.details();
		
		
		System.out.println("Main method ended");
	}

}
