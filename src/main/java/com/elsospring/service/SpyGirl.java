package com.elsospring.service;

import org.springframework.stereotype.Component;

@Component("spying")
//@Scope("session")
public class SpyGirl {
	
	public String iSaySomething() {
		return "I am a spy.";
	}

}
