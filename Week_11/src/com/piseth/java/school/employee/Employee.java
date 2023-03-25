package com.piseth.java.school.employee;

import com.piseth.java.school.Gender;

public class Employee {
	private int id;
	private String name;
	private Gender gender;
	private double salary;
	private EmployeeType employeeType;
	
	public static int count = 0; 

	public Employee(String name, Gender gender, double salary, EmployeeType employeeType) {
		count++;
		this.id = count;
		this.name = name;
		this.gender = gender;
		this.salary = salary;
		this.employeeType = employeeType;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", gender=" + gender + ", salary=" + salary + ", employeeType="
				+ employeeType + "]";
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public EmployeeType getEmployeeType() {
		return employeeType;
	}

	public void setEmployeeType(EmployeeType employeeType) {
		this.employeeType = employeeType;
	}

}
