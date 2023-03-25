package com.piseth.java.school.inheritance;

public class Teacher extends Person{
	
	private double salary;
	private String nationality = "Thai";
	final int HOUR = 30;
	
	public Teacher() {
		super("Thida","female",30);
		this.salary = 100;
		//HOUR = 60;
	}
	
	@Override
	public void showInfo() {
		System.out.println("From teacher class");
	}
	
	public void displayNationality() {
		//System.out.println(nationality);
		System.out.println(super.nationality);
	}
	/*
	 * @Override public String toString() { //return name; return super.toString()
	 * +", salary="+ salary; }
	 */
	
	public double getSalary() {
		return salary;
	}

	

	@Override
	public String toString() {
		return "Teacher [salary=" + salary + ", name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}
