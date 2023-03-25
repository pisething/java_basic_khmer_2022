package com.piseth.java.school;

public class EncapsulationDemo {

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle();
		//rectangle.height = -5;
		rectangle.setHeight(-5);
		//rectangle.width = 4;
		rectangle.setWidth(4);
		
		double area = rectangle.calculateArea();
		System.out.println(area);
	}

}
