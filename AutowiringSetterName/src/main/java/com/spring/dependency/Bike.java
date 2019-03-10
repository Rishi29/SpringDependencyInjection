package com.spring.dependency;



/**
 * @author Rishi
 * 
 * Bike has dependency Enigne, which will be provided by Spring Autowiring ,Setter byName method
 *
 */
public class Bike {
	
	private Engine engine;

	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	public void startBikeEngine() {
		
		engine.start();
		System.out.println("Bike Functioning well");
	}

}
