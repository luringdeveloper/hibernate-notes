package com.control;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.dao.Dao;
import com.dao.UserDao;
import com.model.Student;

public class Test {
public static void main(String[] args) {
	
	
//	//get info
//	System.out.println(new UserDao().getByIdWithGet(10));
//	//output -> null
//	//get-> load data form database
//	
//	System.out.println(new UserDao().getByIdWithload(10));
//	//output-> Exception in thread "main" org.hibernate.ObjectNotFoundException: No row with the given identifier exists: [com.model.Student#10]
//	//load->firstly looking data in l1 cache the database.
	
//	Student student=new Student();
//	
//	student.setEmail("deep11@gmail.com");
//	student.setName("10");
//	student.setPass("10");
//	
//	System.out.println(new UserDao().save(student));
	//System.out.println(new UserDao().persist(student));
	//System.out.println(new UserDao().saveOrUpdate(student));
	
	
	//update and merge
	
	
	
//	Session session= Dao.getSessionFactory().openSession();
//	Student student= session.get(Student.class,11);
//	student.setName("meggi5");
//	session.beginTransaction().commit();
//	session.close();
//	//session.update(student);
//	
//	
//	Session session2= Dao.getSessionFactory().openSession();
//	session2.merge(student);
//	
//	session2.beginTransaction().commit();
//	session2.close();

	
	//evict
	
//	Student student=new Student();
//	student.setEmail("a103@gmail.com");
//	student.setName("10");
//	student.setPass("10");
//	
//	Session session=Dao.getSessionFactory().openSession();
//		Transaction transaction= session.beginTransaction();
//		
//		session.save(student);
//		session.evict(student);
//		transaction.commit();
//		
//		
//		Student student2= UserDao.getByIdWithload(21);
//		System.out.println(student2.getEmail());
		
	
	}
}
