package com.class2_curd_operation.control;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.class2_curd_operation.model.Student;



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
		
		student.setEmail("a1@gmail.com");
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
