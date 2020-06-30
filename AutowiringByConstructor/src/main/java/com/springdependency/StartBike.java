package com.springdependency;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Rishi
 *
 */
public class StartBike {
	
	
	public static void main(String[]args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		
		Bike bike = context.getBean("bike", Bike.class);
		bike.startBikeEngine();
	}

}
