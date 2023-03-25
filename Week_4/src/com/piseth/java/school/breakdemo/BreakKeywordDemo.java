package com.piseth.java.school.breakdemo;

public class BreakKeywordDemo {

	public static void main(String[] args) {
		// break is used to exit loop
		// 1 to 10, sum only first 3 number
		/*
		 * int total = 0; for(int i=1; i<=10; i++) { System.out.println(i); total += i;
		 * if(i == 3) { break; } } System.out.println("Total=" + total);
		 */
		
		// 1 + 3 + 5 + 7 + 9
		int total = 0;
		
		// 2n-1
		
		for(int i=1; i<= 5; i++) {
			total += 2*i -1;
			if(i == 3) {
				break;
			}
		}
		System.out.println(total);
		
	}

}
