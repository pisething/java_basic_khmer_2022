package com.piseth.java.school;

public class ConstructorDemo {

	public static void main(String[] args) {
		/*Student st = new Student();
		st.setName("Dara");
		
		System.out.println("Name="+ st.getName());
		*/
		/*
		Student s = new Student("Thida");
		System.out.println("Name="+ s.getName());
		System.out.println("Age=" + s.getAge());
		*/
		
		//Book b1 = new Book("English", 50.4);
		//Book b1 = new Book("English");
		Book b1 = new Book(); // title = Khmer, price = 20.5
		//b1.setTitle("Java 8"); 
		System.out.println(b1.toString());
	}

}
