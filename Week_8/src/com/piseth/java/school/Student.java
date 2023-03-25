package com.piseth.java.school;

public class Student {
	public String name;
	String gender;
	private int age;
	
	 void setAge(int a) {
		if(a >= 0) {
			age = a;
		}
	}
	
	String toData() {
		return "Name=" + name + " ; Gender=" + gender + " ; Age=" + age;
	}
}
