package com.control;

import com.dao.UserDao;
import com.model.Student;

public class Test {
public static void main(String[] args) {
	
	
	//save 
	
//	Student student=new Student();
//	student.setEmail("b@gmail.com");
//	student.setName("b");
//	student.setPass("2");
//	
//	UserDao userDao=new UserDao();
//	int i=userDao.save(student);
//	System.out.println("save: "+i);
	
	
	//update
	
//	UserDao userDao=new UserDao();
//	Student student= userDao.getById(2);
//	
//	student.setEmail("b1@gmail.com");
//	student.setName("b1");
//	student.setPass("b1");
//	
//	int i=userDao.update(student);
//	System.out.println("update: "+i);
	

	//get info
	
//		UserDao userDao=new UserDao();
//		Student student= userDao.getById(2);
//		
//		System.out.println(student.getSno()+"\t"+ student.getEmail()+"\t"+student.getName()+"\t"+student.getPass());
		
		
	
	//delete
	
//	UserDao userDao=new UserDao();
//	Student student= userDao.getById(2);
//	
//	int i=userDao.delete(student);
//	System.out.println("delete: "+i);
	
	//System.out.println(new UserDao().getCurrentSession());
	
	Student student=new Student();
	student.setEmail("c@gmail.com");
	student.setName("c");
	student.setPass("3");
	
	UserDao userDao=new UserDao();
	int i=userDao.saveWithGetCurrentSession(student);
	System.out.println("save: "+i);
	
}
}
