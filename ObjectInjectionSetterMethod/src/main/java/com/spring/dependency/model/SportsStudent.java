package com.spring.dependency.model;

public class SportsStudent {
	
 Admission admitSportsStudent;	

	public void setAdmitSportsStudent(Admission admitSportsStudent) {
	this.admitSportsStudent = admitSportsStudent;
}

	public void sportsStudentAdmission() {
		
		System.out.print(" Sports  ");
		admitSportsStudent.admitStudent();
	}

}
