package com.piseth.java.school;

public class KhmerLanguage extends Language{
	
	public KhmerLanguage() {
		super(900);
	}
	
	//abstract String hello(); 
	
	
	void display() {
		System.out.println("This is a display method");
	}

	@Override
	void sayHello() {
		System.out.println("Suo Sdey");
	}
	
}
