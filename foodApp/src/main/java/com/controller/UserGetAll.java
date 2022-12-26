package com.controller;

import java.util.List;

import com.dto.User;
import com.service.UserService;

public class UserGetAll 
{
	public static void main(String[] args) 
	{
		UserService userService= new UserService();
		
		List<User> users = userService.getAllUser();
		
		if(users.size() >0)
		{
			for(User user: users)
			{
				System.out.println(" ID: "+user.getId()+"\n Name: "+user.getName()+"\n email: "+user.getEmail()+"\n pwd: "+user.getPassword()+"\n PhNo: "+user.getPhoneNumber()+"\n------------------------");
				
				
//				System.out.println(user); 		// by overriding toString mtd in user class
				
			}
		}
		
	}

}
