package com.service;

import java.util.List;

import com.dao.UserDao;
import com.dto.User;

public class UserService 
{
	public User saveUser(User user)
	{
		UserDao userDao = new UserDao();
		return userDao.saveUser(user);
	}
	
	public List<User> getAllUser(){
		UserDao userDao= new UserDao();
		return userDao.getAllUser();
	}
}
