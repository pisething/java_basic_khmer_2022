package com.piseth.java.school.polygon;

public class Rectangle implements Polygon{
	private double width;
	private double height;

	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + ", Area="+ getArea() + "]";
	}

	public double getArea() {
		return width * height;
	}

	@Override
	public double calculatePerimeter() {
		return (width + height) * 2;
	}

	@Override
	public void draw() {
		System.out.println("Draw rectangle");
	}

	@Override
	public void version() {
		// TODO Auto-generated method stub
		
	}

	

}
