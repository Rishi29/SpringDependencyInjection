package com.spring.dependency;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartBike {
	public static void main(String[]arsg) {
	
	ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
	Bike bike = context.getBean("bikeObject", Bike.class); 
	bike.startBikeEngine();
	
	}
}
