package com.spring.dependency.model;

public class Student {
	
	private int id;
	private String studentName;
	
	
	public void setId(int id) {
		this.id = id;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	
	public void diaplayStudentInfo() {
		System.out.println(" Student name is "+ studentName +" and id is "+ id);
	}

}
