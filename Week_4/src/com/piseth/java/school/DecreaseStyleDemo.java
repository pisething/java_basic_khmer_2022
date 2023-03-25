package com.piseth.java.school;

public class DecreaseStyleDemo {

	public static void main(String[] args) {
		// display from 1 to 5
		/*int i = 1;
		while(i <= 5) {
			System.out.println(i);
			i++;
		}
		*/
		/*
		int n = 5;
		while(n > 0) {
			System.out.println(n);
			n--;
		}
		*/
		
		/*
		 * $
		 * $$
		 * $$$
		 * $$$$
		 * $$$$$
		 * 
		 * &&&&&
		 * &&&&
		 * &&&
		 * &&
		 * &
		 * 
		 */
		
		for(int i = 1; i <= 5; i ++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("$");
			}
			System.out.println();
		}
	}

}
