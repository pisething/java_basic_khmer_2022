package com.piseth.java.school;

public class InheritanceDemo {

	public static void main(String[] args) {
		Animal animal = new Animal();
		//animal.name = "Koko";
		//animal.eat();
		//animal.toString()
		//animal.setName("Koko");
		//animal.showName();
		
		Dog d1 = new Dog();
		//d1.name = "Kitty";
		//d1.eat();
		//d1.showInfo();
		//d1.setName("Kitty");
		//d1.showName();
		//d1.displayName();  // This dog is named Kitty
		d1.eatAll();
	}

}
