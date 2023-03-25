package com.piseth.java.school;

public class Rectangle extends Shape {
	private double width;
	private double height;
	
	
	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	@Override
	public void draw() {
		System.out.println("Draw rectangle");
	}

	@Override
	double getArea() {
		return width * height;
	}

	@Override
	String getType() {
		return "rectangle";
	}
}
