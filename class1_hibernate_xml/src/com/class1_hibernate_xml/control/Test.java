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
		
		
		
		SessionFactory sessionFactory=configuration.buildSessionFactory();
		
		Session session= sessionFactory.openSession();
		
		
		
		Student student=new Student();
		
		student.setEmail("abc@gmail.com");
		student.setName("a");
		student.setPass("1");
		
		session.save(student);
		session.beginTransaction().commit();
		
	
		
		System.out.println("Successfully store");
}
}
