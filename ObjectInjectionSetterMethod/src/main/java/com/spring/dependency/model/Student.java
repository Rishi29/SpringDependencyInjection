package com.spring.dependency.model;


/**
 * @author Rishi
 *
 */
public class Student {

	private Admission admission;

	public void setAdmission(Admission admission) {
		this.admission = admission;
	}

	public void takeAdmission() {
		System.out.print(" Academic ");
		admission.admitStudent();
	}

}
