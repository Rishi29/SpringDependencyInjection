package com.spring.dependency.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.dependency.model.DataService;
import com.spring.dependency.model.MobileCarrier;

public class ProvideService {
	
	public static void main(String []arsg) {
	
	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	
	MobileCarrier mobileCarrier = context.getBean("mobileCarrier",MobileCarrier.class);
	
	mobileCarrier.activateService();
	
	}
	

}
