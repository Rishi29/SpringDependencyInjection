package com.spring.dependency;

public class Bike { 
	
	private Engine engine;
	
	public Bike(Engine engineBean) {
		this.engine = engineBean;
	}
	
	public void startBike() {
		engine.start();
		System.out.println("Bike is functioning well");
	}
	

}
