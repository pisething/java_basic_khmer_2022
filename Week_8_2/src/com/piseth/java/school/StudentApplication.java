package com.piseth.java.school;

public class StudentApplication {

	public static void main(String[] args) {
		StudentService studentService = new StudentService();
		
		int numberOfStudent = 3; 
		Student[]  studentArray = studentService.createStudentArray(numberOfStudent);

		studentService.print(studentArray);
		
		//studentService.sortByName(studentArray);
		//studentService.sortByAge(studentArray);
		//System.out.println("After sorting");
		//studentService.print(studentArray);
		System.out.println("=========== Oldest student ");
		Student oldestStudent = studentService.getOldestStudent(studentArray);
		System.out.println(oldestStudent.getName());
		
	}

}
