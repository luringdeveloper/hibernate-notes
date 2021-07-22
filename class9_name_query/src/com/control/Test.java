package com.control;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;


import com.model.Student;
import com.model.StudentCompositeKey;

public class Test {
public static void main(String[] args) {
	

	
	SessionFactory sessionFactory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	Session session= sessionFactory.openSession();
	
	

	Query q=session.createNamedQuery("all");
	List<Student> students= q.getResultList();
	students.stream().forEach(x->System.out.println(x.getStudent_composite_key().getEmail()));
	
	session.close();
	
	
	
	
	
}
}
