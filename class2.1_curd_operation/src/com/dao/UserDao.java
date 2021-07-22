package com.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.Student;

public class UserDao {
	
	public int save(Student user) {
		int i=0;
		Session session=Dao.getSessionFactory().openSession();
		session.save(user);
		session.beginTransaction().commit();
		session.close();
		return i=1;
	}
	
	public int update(Student user) {
		int i=0;
		Session session=Dao.getSessionFactory().openSession();
		session.update(user);
		session.beginTransaction().commit();
		session.close();
		return i=1;
	}
	
	public int delete(Student user) {
		int i=0;
		Session session=Dao.getSessionFactory().openSession();
		session.delete(user);
		session.beginTransaction().commit();
		session.close();
		return i=1;
	}
	
	public Student getById(int id) {
		
		Session session=Dao.getSessionFactory().openSession();
		Student student= session.get(Student.class,id);
		
		return student;
	}
	
	
	public int saveWithGetCurrentSession(Student user) {
		int i=0;
		Session session=Dao.getSessionFactory().getCurrentSession();
		Transaction transaction= session.beginTransaction();
		session.save(user);
		transaction.commit();
		
		return i=1;
	}
	

	 
	
}
