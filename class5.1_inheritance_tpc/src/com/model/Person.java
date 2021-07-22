package com.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;


@Entity

@Inheritance(strategy =InheritanceType.TABLE_PER_CLASS )

public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int persionid;
	
	private String name;
	
	public int getPersionid() {
		return persionid;
	}
	public void setPersionid(int persionid) {
		this.persionid = persionid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
