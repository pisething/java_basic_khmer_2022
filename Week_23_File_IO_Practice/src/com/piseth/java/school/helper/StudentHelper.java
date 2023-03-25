package com.piseth.java.school.helper;

import java.util.Scanner;

import com.piseth.java.school.model.Student;

public class StudentHelper {
	public Student getStudentFromKeyboard() {
		/*
		System.out.print("Input Name");
		String name = scanner.next();
		
		System.out.print("Input Name");
		String gender = scanner.next();
		*/
		String name = getString("Input Name");
		String gender = getString("Input Gender");
		return null;
	}
	
	private String getString(String label) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(label);
		String text = scanner.next();
		return text;
	}
}
