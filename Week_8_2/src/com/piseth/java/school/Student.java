package com.piseth.java.school;

public class Student {
	private String name;
	private String gender;
	private int age;
	
	public String toString() {
		return  "Name=" + name + "; Gender=" + gender + "; Age=" + age; 
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public String getGender() {
		return gender;
	}
	
	public int getAge() {
		return age;
	}
}
