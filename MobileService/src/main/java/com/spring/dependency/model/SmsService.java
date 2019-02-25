package com.spring.dependency.model;

public class SmsService implements Service {

	@Override
	public void mobileService() {

		System.out.println(" SMS Service Enabled");

	}

}
