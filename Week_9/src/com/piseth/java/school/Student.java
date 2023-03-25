package com.piseth.java.school;

public class Student {
	private String name;
	private int age;

	public Student() {
		System.out.println("Student object is created");
	}
	
	public Student(String n) {
		name = n;
		age = 23;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}
