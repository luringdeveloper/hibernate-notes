package com.model;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.Entity;

@Embeddable
public class StudentCompositeKey implements Serializable {

	
	private long mobile;
	private String email;
	
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
