package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Address {
	
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int id;	

private int pincode;
private String state;


public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getPincode() {
	return pincode;
}
public void setPincode(int pincode) {
	this.pincode = pincode;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}


}
