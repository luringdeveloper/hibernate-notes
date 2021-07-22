package com.control;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.model.Teacher;
import com.model.Person;
import com.model.Student;

public class Test {
public static void main(String[] args) {
	

	Session session=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
	
//	Person person=new Person();
//	person.setName("person");
//	
//	session.save(person);
//	session.beginTransaction().commit();
//	
//	session.close();
//	System.out.println("done");
	
	
//	Student student=new Student();
//	student.setMarks(99);
//	student.setName("ajay");
//	
//	session.save(student);
//	session.beginTransaction().commit();
//	
//	session.close();
//	System.out.println("done");
//	
	Teacher teacher=new Teacher();
	teacher.setSalary(70000);
	teacher.setName("ajay");
	
	session.save(teacher);
	session.beginTransaction().commit();
	
	session.close();
	System.out.println("done");
	
	
	
	
}
}
