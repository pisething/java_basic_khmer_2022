package com.piseth.java.school;

public class Dog extends Animal{
	
	void displayName() {
		System.out.println("Dog name is " + name);
	}
	
	void showInfo() {
		System.out.println("This is a dog");
	}
	
	/*
	 * protected void eat() { System.out.println("Dog eat dog's food"); }
	 */
	
	@Override
	void showName() {
		System.out.println("This dog is named " + name);
	}
	
	void setName(String n) {
		this.name = n  + " (From Dog class)";
	}
	
	void eatAll() {
		super.eat();
		System.out.println("Eat called from super class");
		this.eat();
	}

}
