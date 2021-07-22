package com.control;


import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import com.model.Address;
import com.model.Student;

public class School {
	
	public static void main(String[] args) {
		
		Session session=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
		
//save
		
//		Set<Address> addresses=new HashSet();
//		
//		Address parmanent_address=new Address();
//		parmanent_address.setPincode(201005);
//		parmanent_address.setState("U.P");
//		
//		Address temporary_address=new Address();
//		temporary_address.setPincode(110095);
//		temporary_address.setState("delhi");
//		
//		addresses.add(parmanent_address);
//		addresses.add(temporary_address);
//		
//		Student student =new Student();
//		student.setRoll(1);
//		student.setName("a");
//		student.setAddresses(addresses);
//		
//		session.save(student);
//		session.beginTransaction().commit();
//		session.close();

// load
		
//Student student= session.load(Student.class,31);		
//System.out.println(student.getName());
//student.getAddresses().forEach(x->System.out.println(x.getState()+"\t"+x.getPincode()));

//delete
		
		Student student= session.load(Student.class,28);	
		session.delete(student);
		session.beginTransaction().commit();
		session.close();
	}

}
