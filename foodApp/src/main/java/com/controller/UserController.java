package com.controller;

import com.dto.User;
import com.service.UserService;

public class UserController 
{
	public static void main(String[] args) 
	{
	
		UserService userService = new UserService();
		User user = new User();
		user.setName("Jerry");
		user.setEmail("Jerry@gmail.com");
		user.setPassword("Jar123");
		user.setPhoneNumber(4454422331l);
		
		User user2 = userService.saveUser(user);
		if(user2 !=null)
			System.out.println("Data inserted");
		else System.out.println("Data not inserted");
	}
	

}
