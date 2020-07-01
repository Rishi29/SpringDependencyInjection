package com.spring.dependency;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Start {
	
	public static void main(String[]args) {
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("bean.xml");
		Bike bike = appContext.getBean("bike",Bike.class);
		bike.startBike();
											
	}

}
