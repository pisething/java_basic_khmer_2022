package com.piseth.java.school.inheritance;

public class Student extends Person{
	
	public Student() {
		super("Dara","male",18);
	}
	
	private int grade;

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	
}
