package com.springdependency;

public class Bike {

	private Engine engine;

	public void setEngine(Engine engine) {
		this.engine = engine;

		System.out.println("Calling setter method to set the engine Object");
	}

	public void startBikeEngine() {
		engine.start();
	}

}
