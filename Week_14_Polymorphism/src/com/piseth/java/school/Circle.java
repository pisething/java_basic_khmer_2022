package com.piseth.java.school;

public class Circle extends Shape {
	private double r;
	
	
	
	public Circle(double r) {
		super();
		this.r = r;
	}

	@Override
	public void draw() {
		System.out.println("Draw circle");
	}
	
	public void draw(double radius) {
		System.out.println("Draw circle with radius="+ radius);
	}

	@Override
	double getArea() {
		return Math.PI * r*r;
	}

	@Override
	String getType() {
		return "circle";
	}
}
