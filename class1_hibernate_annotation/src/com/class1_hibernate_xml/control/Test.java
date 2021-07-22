package com.class1_hibernate_xml.control;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.class1_hibernate_xml.model.Student;

public class Test {
public static void main(String[] args) {
	//load Your Configuration file
	
		Configuration configuration=new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		
		//Session Factory is a thread safe
		SessionFactory sessionFactory=configuration.buildSessionFactory();
		
		Session session= sessionFactory.openSession();
		
		
		//transient state
		Student student=new Student();
		
		student.setEmail("ajaypall@gmail.com");
		student.setName("ajay");
		student.setPass("12345");
		
		//persistence state
		session.save(student);
		session.beginTransaction().commit();
		
		//detached state
		session.close();
		System.out.println("Successfully store");
}
}
