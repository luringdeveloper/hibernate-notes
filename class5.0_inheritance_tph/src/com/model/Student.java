package com.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "Student")
public class Student extends Person {

		private int roll;
		
		public int getRoll() {
			return roll;
		}
		
		public void setRoll(int roll) {
			this.roll = roll;
		}

	
	
}
