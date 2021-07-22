package com.model;

import javax.persistence.Cacheable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity

@NamedQueries(@NamedQuery(name = "all",query = "from Student"))
public class Student {

	@EmbeddedId
	private StudentCompositeKey student_composite_key; 
	private float marks;
	
	public StudentCompositeKey getStudent_composite_key() {
		return student_composite_key;
	}
	public void setStudent_composite_key(StudentCompositeKey student_composite_key) {
		this.student_composite_key = student_composite_key;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	

	
	
}
