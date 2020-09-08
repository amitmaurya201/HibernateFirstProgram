package com.amit.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
public static void main(String[] args) {
	Configuration c=new Configuration();
	c.configure();
	SessionFactory sf=c.buildSessionFactory();
	
	Session session=sf.openSession();
	
	Student s=new Student();
	s.setName("Deep Sir");
	s.setMarks(89.9f);
	
	session.persist(s);
	
	session.beginTransaction().commit();
	System.out.println("success");
}
}