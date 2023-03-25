package com.piseth.java.school.employee;

import com.piseth.java.school.Gender;

public class EmployeeApplication {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1 = new Employee("Dara", Gender.MALE, 500, EmployeeType.FULL_TIME);
		Employee e2 = new Employee("Thida", Gender.FEMALE, 500, EmployeeType.FULL_TIME);
		Employee e3 = new Employee("Seyha", Gender.MALE, 600, EmployeeType.PART_TIME);
		Employee e4 = new Employee("Dalin", Gender.FEMALE, 300, EmployeeType.INTERNSHIP);
		Employee e5 = new Employee("Veasna", Gender.MALE, 400, EmployeeType.FULL_TIME);
		//System.out.println(e1.toString());
		//System.out.println(e2.toString());
		
		Employee[] employees = new Employee[] {e1, e2, e3,e4,e5};
		
		//System.out.println(Employee.count);
		
		EmployeeService employeeService = new EmployeeService();
		//int numberOfFemale = employeeService.countEmployeeByGender(employees, Gender.FEMALE);
		//int numberOfMale = employeeService.countEmployeeByGender(employees, Gender.MALE);
		//System.out.println(numberOfFemale);
		//System.out.println(numberOfMale);
		//double bonusE1 = employeeService.calculateBonus(e1);
		//System.out.println(bonusE1);
		
		double paymentE1 = employeeService.calculateTotalPaymentOfEmployee(e1);
		System.out.println(paymentE1);
		

	}

}
