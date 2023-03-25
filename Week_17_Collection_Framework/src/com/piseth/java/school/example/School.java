package com.piseth.java.school.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class School {
	private String name;
	private ArrayList<Student> students = new ArrayList<>();
	
	/*
	public School() {
		students = new ArrayList<>();
	}
	*/
	
	
	public void registerStudent(Student student) {
		students.add(student);
	}
	
	public void displayStudents() {
		for(Student student : students) {
			System.out.println("Name = %s, Gender = %s".formatted(student.getName(), student.getGender()));
		}
	}
	
	public void removeStudent(int studentId) {
		/*for(Student student : students) {
			if(student.getId() == studentId) {
				students.remove(student);
			}
		}*/
		
		Iterator<Student> iterator = students.iterator();
		while(iterator.hasNext()) {
			Student student = iterator.next();
			if(student.getId() == studentId) {
				iterator.remove();
			}
		}
	}
	
	public void sortByName() {
		Comparator<Student> comparator = new Comparator<Student>() {
			
			@Override
			public int compare(Student o1, Student o2) {
				return o1.getName().compareTo(o2.getName());
			}
		};
		students.sort(comparator);
	}
	
	public Student findByName(String name) {
		for(Student student : students) {
			if(student.getName().equals(name)) {
				return student;
			}
		}
		return null;
	}
	
	public Student findById(int id) {
		for(Student student : students) {
			if(student.getId() == id) {
				return student;
			}
		}
		return null;
	}
	
	public void updateStudent(int studentId, Student newStudent) {
		Student student = findById(studentId);
		if(student != null) {
			student.setName(newStudent.getName());
			student.setGender(newStudent.getGender());
		}else {
			System.out.println("Student is not found");
		}
	}
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Student> getStudents() {
		return students;
	}

	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}

}
