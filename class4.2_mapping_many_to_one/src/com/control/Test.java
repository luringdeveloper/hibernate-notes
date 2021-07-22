package com.control;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.model.College;
import com.model.Student;

public class Test {
public static void main(String[] args) {
	
//	StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
//	Metadata meta=new MetadataSources(ssr).addAnnotatedClass(Student.class).addAnnotatedClass(College.class).getMetadataBuilder().build();
//	
//	Session session= meta.buildSessionFactory().openSession();
	
	Session session=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
	
	College college=new College();
	college.setCollege_name("ITS");
	
	Student student1=new Student();
	student1.setCollege(college);
	student1.setName("yash");
	
	Student student2=new Student();
	student2.setCollege(college);
	student2.setName("Ajay");
	
	Transaction transaction=session.beginTransaction();
	session.save(student1);
	session.save(student2);
	
	transaction.commit();
	
	session.close();
	System.out.println("Successful inserted");
	
	
	
	
}
}
