package com.piseth.java.school;

public class Animal{
	protected String name;
	
	void setName(String name) {
		this.name = name;
	}
	
	void showName() {
		System.out.println("Animal name is : "+ name);
	}
	
	protected void eat() {
		System.out.println("Animal can eat.");
	}
}
