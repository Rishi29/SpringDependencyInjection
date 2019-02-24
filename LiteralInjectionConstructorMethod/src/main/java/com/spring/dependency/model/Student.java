package com.spring.dependency.model;

public class Student {

	private int id;
	private String studentName;

	public Student(int id, String studentName) {
		this.id = id;
		this.studentName = studentName;
	}

	public void diaplayStudentInfo() {
		System.out.println(" Student name is " + studentName + " and id is " + id);
	}

}
