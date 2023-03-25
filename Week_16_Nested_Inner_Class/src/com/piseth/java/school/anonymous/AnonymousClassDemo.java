package com.piseth.java.school.anonymous;

public class AnonymousClassDemo {
	
	Shape sh2 = new Shape() {
		
	};
	
	 Shape sh1 = new Shape() {
		public void draw() {
			System.out.println("Drawing something");
		};
	};
	
	void test() {
		sh1.draw();
	}
	
	static Polygon p2 = new Polygon() {

		@Override
		public void info() {
			System.out.println("My interface");
			t();
		}
		
		public void t() {
			System.out.println("Something");
		}
		
	};

	public static void main(String[] args) {
		//Rectangle rec = new Rectangle();
		//rec.draw();
		//sh1.draw();
		
		//AnonymousClassDemo demo = new AnonymousClassDemo();
		
		//demo.test();
		
		p2.info();
		
	}
	
	

}
