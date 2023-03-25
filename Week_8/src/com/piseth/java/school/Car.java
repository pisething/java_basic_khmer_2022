package com.piseth.java.school;

public class Car {
	String color;
	int numberOfWheel;
	double price;
	boolean isDriving;

	void drive2() {
		System.out.println("Car drive");
	}
	
	void info() {
		System.out.println("Color=" + color + "; Number of wheel =" + numberOfWheel +"; Price="+ price);
	}
	
	void info2() {
		System.out.println("Color=%s Number of wheel = %d Price=%f".formatted(color, numberOfWheel, price));
	}
	
	void info3() {
		System.out.println(String.format("V3 Color=%s Number of wheel = %d Price=%f", color, numberOfWheel, price));
	}
	
	void drive() {
		isDriving = true;
	}
	
	void stop() {
		isDriving = false;
	}
	
	public static void main(String[] args) {
		Car car = new Car();
		car.color = "Red";
		car.numberOfWheel = 4;
		car.price = 20000;
//		System.out.println(car.color);
//		System.out.println(car.numberOfWheel);
//		System.out.println(car.price);
		//car.drive();
		//car.info3();
		System.out.println(car.isDriving);
		car.drive();
		System.out.println(car.isDriving);
		car.stop();
		System.out.println(car.isDriving);
	}
}
