package com.spring.dependency.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.dependency.model.SportsStudent;
import com.spring.dependency.model.Student;


/**
 * @author Rishi
 *
 */
public class University {
	
	public static void main(String[]args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Student student = context.getBean("student",Student.class);
	
		student.takeAdmission();
		
		SportsStudent sportStudent = context.getBean("sportsStudent", SportsStudent.class);
		
		sportStudent.sportsStudentAdmission();
	}

}
