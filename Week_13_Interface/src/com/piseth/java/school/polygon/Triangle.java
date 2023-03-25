package com.piseth.java.school.polygon;

public class Triangle implements Area, Perimeter{
	protected double a;
	protected double b;
	protected double c;
	
	
	
	  public Triangle() {
	  
	  }
	 
	 
	
	public Triangle(double a, double b, double c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	@Override
	public double getArea() {
		//double p = a+b+c/2;
		double p = calculatePerimeter()/2;
		return Math.sqrt(p*(p-a)*(p-b)*(p-c));
	}

	@Override
	public double calculatePerimeter() {
		return a + b + c;
	}
	
	
}
