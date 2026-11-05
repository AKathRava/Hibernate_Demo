package com.controller;

import java.util.List;

import com.dao.UserDao;
import com.entity.User;
import com.service.Service;

public class Controller {

	Service service = new Service();
	
	public String saveUser(User user)
	{
		return service.saveUser(user);
	}
	
	public User getUser(int id)
	{
		return service.getUser(id);
	}

	public List<User> getAllUsers()
	{
		return service.getAllUsers();
	}
	
	public String updateById(User user)
	{
		return service.updateById(user);
	}
	
	public String delete(int id)
	{
		return service.delete(id);
	}
}
