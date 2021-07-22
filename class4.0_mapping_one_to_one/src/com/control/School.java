package com.control;


import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import com.model.Address;
import com.model.Student;

public class School {
	
	public static void main(String[] args) {
		
		Session session=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
		
//save
		
//		Address address=new Address();
//		address.setPincode(201005);
//		address.setState("U.P");
//		
//		Student student =new Student();
//		student.setRoll(1);
//		student.setName("a");
//		student.setAddress(address);
//		
//		session.save(student);
//		session.beginTransaction().commit();
//		session.close();

// load
		
//Student student= session.load(Student.class,26);		
//System.out.println(student.getName());
//System.out.println(student.getAddress().getState());

//delete
		
//		Student student= session.load(Student.class,26);	
//		session.delete(student);
//		session.beginTransaction().commit();
//		session.close();
	}

}
