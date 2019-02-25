package com.spring.dependency.model;

public class VoiceMessageService implements Service {

	@Override
	public void mobileService() {
		System.out.println("voice message Service enabled");

	}

}
