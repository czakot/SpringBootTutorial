package com.elsospring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {
/*	
	@Value("${spring.profiles.active}")
	private String selectedProfile;
*/	
	private String name;
	private int age;
	
	//@Value("${msg}")
	private String message;

	public Person() {

	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Person(String message) {
		super();
		this.message = message;
	}
/*
	@Override
	public String toString() {
		return "Person [selectedProfile=" + selectedProfile + ", message=" + message + "]";
	}
*/
	@Override
	public String toString() {
		return "Person [message=" + message + "]";
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
/*
	public String getSelectedProfile() {
		return selectedProfile;
	}

	public void setSelectedProfile(String selectedProfile) {
		this.selectedProfile = selectedProfile;
	}
*/
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
