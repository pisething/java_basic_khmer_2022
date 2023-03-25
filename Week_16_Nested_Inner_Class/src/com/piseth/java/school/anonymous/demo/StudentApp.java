package com.piseth.java.school.anonymous.demo;

import java.util.Arrays;
import java.util.Comparator;

public class StudentApp {

	public static void main(String[] args) {
		Student[] students = new Student[] {
				new Student("Dara", 18),
				new Student("Thida", 16),
				new Student("Seyha", 20),
				new Student("Dawin", 17),
		};
		
		for(Student st : students) {
			System.out.println(st);
		}
		System.out.println("================");
		//Arrays.sort(students, new SortByAge());
		/*
		Comparator<Student> sortByName = new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				return o2.getName().compareTo(o1.getName());
			}
			
		};
		*/
		
		Arrays.sort(students, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return o1.getAge() - o2.getAge();
			}
		});
		
		for(Student st : students) {
			System.out.println(st);
		}
	}

}
