package com.piseth.java.school;

import java.util.Arrays;

public class PolymorphismDemo {

	public static void main(String[] args) {
		
		Shape[] shapes = new Shape[] {
				new Circle(5),
				new Rectangle(4, 5),
				new Circle(4),
				new Triangle(3, 4, 5),
				new Rectangle(2, 4)
		};
		//SortShapeByArea sortShapeByArea = new SortShapeByArea();
		Arrays.sort(shapes, new  SortShapeByType());
		
		for(Shape shape : shapes) {
			shape.display();
		}
		
		double totalArea = 0;
		for(Shape shape : shapes) {
			totalArea += shape.getArea();
		}
		System.out.println(totalArea);
	}
	
	void test() {

		//Shape shape = new Rectangle();
		//shape.draw();
		
		//Shape shape = new Shape();
		//shape.draw();
		
		//Circle circle = new Circle();
		//circle.draw();
		
		//circle.draw(5);
		
		//System.out.p
		
		//+
		/*
		int total = 5 + 4;
		System.out.println(total);
		
		String text = "Dara" + " is a student";
		System.out.println(text);
		String text2 = "5" + (4 +8);
		System.out.println(text2);
		8*/

	}

}
