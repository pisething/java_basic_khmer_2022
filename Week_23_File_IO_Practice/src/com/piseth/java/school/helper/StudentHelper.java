package com.piseth.java.school.helper;

import java.util.List;
import java.util.Scanner;

import com.piseth.java.school.entity.Gender;
import com.piseth.java.school.entity.Student;

public class StudentHelper {
	
	private static int count = 0;
	private static Scanner scanner = new Scanner(System.in);
	
	public static Student createStudent() {
		setCount(); // get lastest number
		String name = getString("Input Name: ");
		String gender = getString("Input Gender: ");
		int grade = getInt("Input Grade: ");
		
		int id = ++count;
		Student student = new Student(id, name, Gender.valueOf(gender), grade);
		return student;
	}
	
	private static String getString(String label) {
		System.out.print(label);
		return scanner.next();
	}
	
	private static int getInt(String lable) {
		return Integer.parseInt(getString(lable));
	}
	
	private static void setCount() {
		List<String> data = FileHelper.readData();
		String lastData = data.get(data.size()-1);
		String[] texts = lastData.split(",");
		int lastNumber = Integer.parseInt(texts[0]);
		count = lastNumber;
	}
}
