package com.control;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import com.model.Student;

public class Test {

	public static void main(String[] args) {
	Session session=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
	
//	Student student=new Student();
//	student.setMarks(86f);
//	student.setName("c");
//
//	session.save(student);
//	session.beginTransaction().commit();
//	session.close();
//	System.out.println("done");
	
//	   CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
//       CriteriaQuery<Student> criteriaQuery = criteriaBuilder.createQuery(Student.class);
//       Root<Student> root = criteriaQuery.from(Student.class);
//       criteriaQuery.select(root);
//       
//       Query query=session.createQuery(criteriaQuery);
//       List<Student> students=query.getResultList();
//	
//       students.stream().forEach(st->System.out.println(st.getName()));
       
       
//       CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
//       CriteriaQuery<Student> criteriaQuery = criteriaBuilder.createQuery(Student.class);
//       Root<Student> root = criteriaQuery.from(Student.class);
//       criteriaQuery.select(root).where(criteriaBuilder.gt(root.get("marks"), 85));
//       
//       
//       Query query=session.createQuery(criteriaQuery);
//       List<Student> students=query.getResultList();
//	
//       students.stream().forEach(st->System.out.println(st.getMarks()));
       
      

       CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
       CriteriaQuery<Double> criteriaQuery = criteriaBuilder.createQuery(Double.class);
       Root<Student> root = criteriaQuery.from(Student.class);
       
       criteriaQuery.select(criteriaBuilder.avg(root.get("marks")));
       Query query = session.createQuery(criteriaQuery);
      
       double avgSalary = (double)query.getSingleResult();
       System.out.println("Average Salary = " + avgSalary);
       
       

	}
	
}
