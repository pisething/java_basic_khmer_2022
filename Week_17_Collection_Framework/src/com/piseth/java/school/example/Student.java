package com.piseth.java.school.example;

public class Student {
	private Integer id;
	private String name;
	private Gender gender;

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", gender=" + gender + "]";
	}

	public Student(Integer id, String name, Gender gender) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
	}
	
	public Student(String name, Gender gender) {
		this.name = name;
		this.gender = gender;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

}
