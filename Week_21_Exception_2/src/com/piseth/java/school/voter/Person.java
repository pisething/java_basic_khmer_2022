package com.piseth.java.school.voter;

import java.time.LocalDate;

public class Person {
	private Long id;
	private String name;
	private String gender;
	private LocalDate dateOfBirth;
	private String idCard;
	
	
	public Person(Long id, String name, String gender, LocalDate dateOfBirth, String idCard) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.idCard = idCard;
	}
	
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", gender=" + gender + ", dateOfBirth=" + dateOfBirth
				+ ", idCard=" + idCard + "]";
	}


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getIdCard() {
		return idCard;
	}
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}
	
	
}
