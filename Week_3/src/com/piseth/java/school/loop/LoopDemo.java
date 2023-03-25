package com.piseth.java.school.loop;

public class LoopDemo {

	public static void main(String[] args) {
		/*
		 * System.out.println("Welcome to Cambodia");
		 * System.out.println("Welcome to Cambodia");
		 * System.out.println("Welcome to Cambodia");
		 * System.out.println("Welcome to Cambodia");
		 * System.out.println("Welcome to Cambodia");
		 */
		/*
		 * for(int i=1; i<=5; ) { System.out.println("Welcome to Cambodia"); i++; }
		 * 
		 */
		/*
		 * for(initialExpression; testExpression; updateExpression){
		 * 
		 * statement }
		 * 
		 * 
		 */
			
		// sum from 1 to 5
		// 1+2+3+4+5
		/*
		 * int total=0; for (int i = 1; i < 5; i++) { //System.out.println(i); total =
		 * total + i; } System.out.println(total);
		 */
		// 1*2*3*4*5 = 5!
		int total=1;
		for (int i = 1; i <= 5; i++) {
			total = total * i;
		}
		System.out.println(total);

	}

}
