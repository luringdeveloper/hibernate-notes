package com.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.Student;

public class UserDao {
	
	public int save(Student user) {
		int i=0;
		Session session=Dao.getSessionFactory().openSession();
		System.out.println(session.save(user));
		session.beginTransaction().commit();
		session.close();
		return i=1;
	}
	
	public int persist(Student user) {
	int i=0;
	Session session=Dao.getSessionFactory().openSession();
	session.persist(user);
	session.beginTransaction().commit();
	session.close();
	return i=1;
}
	public int saveOrUpdate(Student user) {
		int i=0;
		Session session=Dao.getSessionFactory().openSession();
		session.saveOrUpdate(user);
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
	
	public int merge(Student user) {
		int i=0;
		Session session=Dao.getSessionFactory().openSession();
		session.merge(user);
		session.beginTransaction().commit();
		session.close();
		return i=1;
	}
	
	

	public Student getByIdWithGet(int id) {
		
		return  Dao.getSessionFactory().openSession().get(Student.class,id);
	}
	
	public static Student getByIdWithload(int id) {
		
				return  Dao.getSessionFactory().openSession().load(Student.class,id);
	}
	
	


	 
	
}
