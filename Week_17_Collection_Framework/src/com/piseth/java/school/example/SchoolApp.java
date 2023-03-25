package com.piseth.java.school.example;

public class SchoolApp {

	public static void main(String[] args) {
		School school = new School();
		school.setName("Piseth Java School");
		
		// Register student
		Student st1 = new Student(1, "Dara", Gender.M);
		Student st2 = new Student(2, "Thida", Gender.F);
		Student st3 = new Student(3, "Cheata", Gender.F);
		school.registerStudent(st1);
		school.registerStudent(st2);
		school.registerStudent(st3);
		
		//System.out.println(school.getStudents());
		school.displayStudents();
		
		// remove
		System.out.println("============");
		//school.removeStudent(2);
		school.sortByName();
		school.displayStudents();
		/*
		System.out.println("===== Search student ========");
		Student foundStudent = school.findByName("Dara");
		if(foundStudent != null) {
			System.out.println(foundStudent.toString());
		}else {
			System.out.println("Not found");
		}
		*/
		System.out.println("=============== update student ==========");
		Student studentUpdate = new Student("Thidany",Gender.F);
		school.updateStudent(2, studentUpdate);
		
		school.displayStudents();
		
	}

}
