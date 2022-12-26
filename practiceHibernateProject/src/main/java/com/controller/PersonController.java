package com.controller;

import com.dto.Person;
import com.service.PersonService;

public class PersonController 
{
	public static void main(String[] args) 
	{
		PersonService personService= new PersonService();
		
		Person person =new Person();
		person.setName("Mogli");
		person.setAddress("Delhi");
		
		Person person2 = personService.savePerson(person);
		if(person2 !=null)
			System.out.println("Inserted");
		else System.out.println("Not inserted");
		
		
	}

}
