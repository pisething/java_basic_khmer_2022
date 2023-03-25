package com.piseth.java.school;

public class Student {

	private String name;
	private Gender gender;
	private Grade grade;
	
	static int numberOfStudent;

	public Student(String name, Gender gender, Grade grade) {
		super();
		this.name = name;
		this.gender = gender;
		this.grade = grade;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", gender=" + gender + ", grade=" + grade.getValue() + "] " ;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public Grade getGrade() {
		return grade;
	}

	public void setGrade(Grade grade) {
		this.grade = grade;
	}
	
	public static void print() {
		System.out.println("Number Od student=" + numberOfStudent);
	}
	
	

}
