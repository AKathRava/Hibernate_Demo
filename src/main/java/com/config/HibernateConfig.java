package com.config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateConfig {
	
	
	//inside this method we have to read hibernate.cfg.xml file
	//build the session factory to perform DB operation
	
	static Configuration cfg = new Configuration();
	public static SessionFactory getSessionFactory()
	{
		cfg.configure();//it will read hibernate.cfg.xml file
		
	    SessionFactory sessionFactory = cfg.buildSessionFactory();//it will provide SessionFactory OBJ to perform DB operation
	    
	    return sessionFactory;
	}

}
