package com.dao;

import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.config.HibernateConfig;
import com.entity.User;
import com.exception.UserNotFoundException;

public class UserDao {


	SessionFactory sf =HibernateConfig.getSessionFactory();
	
    public String saveUser(User user)
    {
    	Session session = sf.openSession();//save , update , delete , get
    	
    	Transaction tr = session.beginTransaction(); //insert , update , delete
    
        session.save(user); //save method use
        
        //can also use session.persist(user);
        
        tr.commit(); //save the changes
        
        session.close();
        
        return "User Registered Successfully";
    }
    
   
    
    public User getUser(int id)
    {
    	Session session = sf.openSession();
    	
    	User user = session.get(User.class, id);  //User.class calls default constructor so we have to create in user entity
    	
    	if(user == null)
    	{
    		throw new UserNotFoundException("User not Found with id :"+id);
    	}
    	
    	
    	return user;
    }
    
    public List<User> getAllUsers()
    {
    	Session session = sf.openSession();//save delete update get
    	
    	//HQL - hibernate query language
    	
    List<User> users = session.createQuery("from User").list();
    
    return users;
    }
    
    
    public String updateById(User user)
    {
    	Session session = sf.openSession();
    	
    	Transaction tr = session.beginTransaction(); //insert , update , delete
    	
    	User existing = session.get(User.class, user.getId());
    	
    	existing.setUsername(user.getUsername());
    	
    	session.update(existing);
    	
    	tr.commit();
    	
    	session.close();
    	
    	return "Updated";
    }
    
    public String delete(int id)
    {
    	Session session = sf.openSession();
    	
    	Transaction tr = session.beginTransaction(); //insert , update , delete
    
        User user = session.get(User.class,id);
        
        session.delete(user);
        
        tr.commit();
        
        session.close();
        
        return "Deleted";
    }
    
    
    
    
    
}
