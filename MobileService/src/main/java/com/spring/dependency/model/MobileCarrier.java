package com.spring.dependency.model;

public class MobileCarrier {
	
	private Service service;

	public void setService(Service service) {
		this.service = service;
	}
	
	public void activateService() {
		service.mobileService();
	}

}
