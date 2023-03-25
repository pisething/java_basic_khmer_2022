package com.piseth.java.school;

public abstract class Language {
	protected int year;
	
	public Language() {
		//year = 1200;
		this(1250);
	}
	
	public Language(int year) {
		this.year = year;
	}
	
	abstract void sayHello();
	
	abstract void display(); 
	
	void infor() {
		//System.out.println("This is a Language class");
		System.out.println("This language was invented in " + year);
	}
}
