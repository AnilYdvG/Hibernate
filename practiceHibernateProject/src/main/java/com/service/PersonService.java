package com.service;

import com.dao.PersonDao;
import com.dto.Person;

public class PersonService 
{
	public Person savePerson(Person person)
	{
		PersonDao personDao = new PersonDao();
		return personDao.savePerson(person);
	}

}
