package com.main;

import java.util.List;

import com.controller.Controller;
import com.entity.User;
import com.exception.UserNotFoundException;

public class Main {
	
	public static void main(String[] args) {
		
		
		Controller controller = new Controller();
//		
//		User user = new User(3,"ram");
//		
//		String msg = controller.saveUser(user);
//		System.out.println(msg);
//		try
//		{
//		User user = controller.getUser(4);
//	    System.out.println(user);
//		}
//		catch(UserNotFoundException e)
//		{
//			System.out.println(e.getMessage());
//		}
		
//		List<User> allUsers = controller.getAllUsers();
//		System.out.println(allUsers);
		
//		User user = new User(3,"jayShreeRam");
//		
//		String msg = controller.updateById(user);
//		System.out.println(msg);
		
        String msg =controller.delete(2);
		System.out.println(msg);
		
		
		//4 projects
		
		//Book
		//Product
		//Employee
		//Student
	}

}
