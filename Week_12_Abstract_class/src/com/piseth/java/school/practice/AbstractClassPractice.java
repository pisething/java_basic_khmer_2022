package com.piseth.java.school.practice;

public class AbstractClassPractice {
	/*
	 * Cat and Dog have name, age. 
	 * They can eat same food like rice, fish... , but they make some sound differently.
	 * 
	 */
	public static void main(String[] args) {
		//Animal animal = new Animal();
		
		Dog dog = new Dog();
		dog.eat();
		dog.makeSounds();
		
		Cat cat = new Cat();
		cat.eat();
		cat.makeSounds();
	}

}
