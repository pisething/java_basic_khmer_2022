package com.piseth.java.school.polygon;

public class PolygonApplication {

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(4, 5);
		System.out.println(rectangle.calculatePerimeter());
		
		rectangle.infor();
		Polygon.test();
		//rectangle.getArea();
		//System.out.println(rectangle);
		//System.out.println(rectangle.getArea());
		
		Triangle triangle = new Triangle(3, 4, 5);
		//System.out.println(triangle.calculatePerimeter());
		//System.out.println(triangle.getArea());
		
	}

}
