package com.piseth.java.school.polygon;

public interface Polygon extends Area, Perimeter{
	
	public void draw();
	
	void version();
	
	default void infor() {
		System.out.println("it is from polygon");
		
		test2();
		
	}
	
	static void test(){
		System.out.println("Test");
	}
	
	private void test2() {
		System.out.println("test");
	}
	
	
	
}
