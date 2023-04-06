package com.piseth.java.school;

import java.util.List;

import com.piseth.java.school.entity.Gender;
import com.piseth.java.school.entity.Student;
import com.piseth.java.school.helper.FileHelper;
import com.piseth.java.school.helper.StudentHelper;
import com.piseth.java.school.service.StudentService;

public class StudentApplication {
/*
 Student(id,name,gender,grade)
-create student from keyboard
-save to file
-read from file
 */
	public static void main(String[] args) {
		//Student student = new Student(1, "Dara", Gender.MALE, 12);
		//Student student = new Student(2, "Thida", Gender.FEMALE, 11);
		StudentService studentService = new StudentService();
		//studentService.saveStudent(student);
		//List<String> data = FileHelper.readData();
		//System.out.println(data);
		/*
		 * for(String st : data) { System.out.println(st); }
		 */
		
		//id=1 name=Dara gender=Male grade=12
		/*
		List<Student> students = studentService.getStudents();
		for(Student student : students) {
			System.out.println(student.toInfo());
		}
		*/
		
		int numberOfStudent = 2;
		for(int i=0; i< numberOfStudent; i++) {
			Student student = StudentHelper.createStudent();
			studentService.saveStudent(student);
		}
	}

}
