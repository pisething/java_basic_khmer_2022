package com.piseth.java.school.service;

import java.util.ArrayList;
import java.util.List;

import com.piseth.java.school.entity.Gender;
import com.piseth.java.school.entity.Student;
import com.piseth.java.school.helper.FileHelper;

public class StudentService {
	
	public void saveStudent(Student student) {
		FileHelper.saveToFile(student.toData());
		System.out.println("Save Successfully.");
	}
	
	//@TODO separate method for student
	public List<Student> getStudents(){
		List<String> dataList = FileHelper.readData();
		List<Student> students = new ArrayList<>();
		for(String text : dataList) {
			Student student = toStudent(text);
			students.add(student);
		}
		
		return students;
	}
	
	private Student toStudent(String text) {
		String[] data = text.split(",");
		int id = Integer.parseInt(data[0]);
		String name = data[1];
		Gender gender = Gender.valueOf(data[2]);
		int grade = Integer.parseInt(data[3]);
		Student student = new Student(id, name, gender, grade);
		return student;
	}
}
