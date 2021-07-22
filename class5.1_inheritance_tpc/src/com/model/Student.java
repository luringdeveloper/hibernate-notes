package com.model;

import javax.persistence.Entity;

@Entity

public class Student extends Person {

		private int marks;

		public int getMarks() {
			return marks;
		}

		public void setMarks(int marks) {
			this.marks = marks;
		}
	

	
	
}
