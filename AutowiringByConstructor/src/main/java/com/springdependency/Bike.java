package com.springdependency;

/**
 * @author Rishi
 *
 */
public class Bike {

	private Engine engine;

	public Bike(Engine engine) {
		
		super();
		this.engine = engine;
	}

	public void startBikeEngine() {
		engine.start();
	}

}
