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
	
//		StudentCompositeKey compositeKey =new StudentCompositeKey();
//		compositeKey.setEmail("2@gmail.com");
//		compositeKey.setMobile(8287908959l);
//		
//		Student student=new Student();
//		student.setMarks(88.6f);
//		student.setStudent_composite_key(compositeKey);
//		
//		session.save(student);
//		session.beginTransaction().commit();
//		session.close();
//		
//		System.out.println("done");
//			StudentCompositeKey studentCompositeKey=new StudentCompositeKey();
//			studentCompositeKey.setEmail("2@gmail.com");
//			studentCompositeKey.setMobile(8287908959l);
//			
//		Student student =	session.get(Student.class,studentCompositeKey);
//	System.out.println(student.getStudent_composite_key().getEmail());
//	
//	session.close();
//	
//	Session session1= sessionFactory.openSession();
//	Student student1 =	session1.get(Student.class,studentCompositeKey);
//	System.out.println(student1.getStudent_composite_key().getEmail());
//
	
//named query(hql)	
	Query q=session.createNamedQuery("all");
	List<Student> students= q.getResultList();
	students.stream().forEach(x->System.out.println(x.getStudent_composite_key().getEmail()));
	
	session.close();
	
	
	
	
	
}
}
