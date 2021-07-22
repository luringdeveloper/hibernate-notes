package com.control;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;


import com.model.Student;
import com.model.StudentCompositeKey;

public class Test {
public static void main(String[] args) {
	

	Session session=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
	
		StudentCompositeKey compositeKey =new StudentCompositeKey();
		compositeKey.setEmail("ajay@pall");
		compositeKey.setMobile(8287908958l);
		
		Student student=new Student();
		student.setMarks(88.6f);
		student.setStudent_composite_key(compositeKey);
		
		session.save(student);
		session.beginTransaction().commit();
		session.close();
		
		System.out.println("done");
			
	
	
}
}
