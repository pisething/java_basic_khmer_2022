package com.piseth.java.school;

public abstract class Shape /* implements Comparable<Shape> */{
	
	abstract double getArea();
	
	abstract String getType();
	
	public void display() {
		System.out.println(getType() + "  , " + getArea());
	}
	
	public void draw() {
		System.out.println("Draw shape...");
	}
	
	/*
	@Override
	public int compareTo(Shape other) {
		//return (int) (other.getArea() - this.getArea());
		return other.getType().compareTo(this.getType());
	}
	*/
}
