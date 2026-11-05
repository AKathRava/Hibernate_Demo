package com.service;

import java.util.List;

import com.dao.UserDao;
import com.entity.User;

public class Service {
	
	UserDao dao = new UserDao();
	
	public String saveUser(User user)
	{
		return dao.saveUser(user);
	}

	public User getUser(int id)
	{
		return dao.getUser(id);
	}
	
	public List<User> getAllUsers()
	{
		return dao.getAllUsers();
	}
	
	public String updateById(User user)
	{
		return dao.updateById(user);
	}
	
	public String delete(int id)
	{
		return dao.delete(id);
	}
}
