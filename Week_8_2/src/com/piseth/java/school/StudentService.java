package com.piseth.java.school;

import java.util.Scanner;

public class StudentService {
	
	public Student createStudent() {
		Scanner scanner = new Scanner(System.in);
		Student st = new Student();
		
		System.out.print("Name: ");
		st.setName(scanner.next());
		
		System.out.print("Gender: ");
		st.setGender(scanner.next());
		
		System.out.print("Age: ");
		st.setAge(scanner.nextInt());
		return st;
	}
	
	public Student[] createStudentArray(int n) {
		Student[] students = new Student[n];
		
		for(int i=0; i<n; i++) {
			System.out.println("Student " + (i + 1));
			students[i] = createStudent();
		}
		return students;
	}
	
	public void print(Student[] students) {
		for(Student st : students) {
			//System.out.println(st.toString());
			System.out.println(st);
		}
	}
	
	public void sortByName(Student[] students) {
		for(int i=0; i<students.length; i++) {
			for(int j = i + 1; j< students.length; j++) {
				if(students[i].getName().compareTo(students[j].getName()) > 0) {
					Student tmp = students[i];
					students[i] = students[j];
					students[j] = tmp;
				}
			}
		}
	}
	
	public void sortByAge(Student[] students) {
		for(int i=0; i<students.length; i++) {
			for(int j = i + 1; j< students.length; j++) {
				if(students[i].getAge() > students[j].getAge()) {
					Student tmp = students[i];
					students[i] = students[j];
					students[j] = tmp;
				}
			}
		}
	}
	
	public Student getOldestStudent(Student[] students) {
		Student maxAgeStudent = students[0];
		for(int i =1; i<students.length; i++) {
			if(maxAgeStudent.getAge() < students[i].getAge()) {
				maxAgeStudent = students[i];
			}
		}
		return maxAgeStudent;
	}
	
	
	
}
