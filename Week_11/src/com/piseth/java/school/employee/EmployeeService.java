package com.piseth.java.school.employee;

import com.piseth.java.school.Gender;

public class EmployeeService {
	
	public Employee[] createEmployees(int n) {
		return null;
	}
	
	public Employee createEmployee() {
		return null;
	}
	
	public double calculateTotalPaymentOfEmployee(Employee employee) {
		double payment = employee.getSalary() + calculateBonus(employee);
		return payment;
	}
	
	public double calculateBonus(Employee employee) {
		double bonus = 0.0;
		switch(employee.getEmployeeType()) {
		case FULL_TIME : bonus = employee.getSalary() * 0.05; break;
		case PART_TIME : bonus = employee.getSalary() * 0.03; break;
		case INTERNSHIP : bonus = employee.getSalary() * 0.02; break;
		}
		return bonus;
	}
	
	public int countEmployeeByGender(Employee[] employees, Gender gender) {
		int total = 0;
		for(Employee employee : employees) {
			if(employee.getGender() == gender) {
				total++;
			}
		}
		return total;
	}
	
	/*
	public int countFemaleEmployee(Employee[] employees) {
		int total = 0;
		for(Employee employee : employees) {
			if(employee.getGender() == Gender.FEMALE) {
				total++;
			}
		}
		return total;
	}
	
	public int countMaleEmployee(Employee[] employees) {
		int total = 0;
		for(Employee employee : employees) {
			if(employee.getGender() == Gender.MALE) {
				total++;
			}
		}
		return total;
	}
	*/

}
