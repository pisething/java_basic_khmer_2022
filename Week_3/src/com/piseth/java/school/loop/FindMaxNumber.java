package com.piseth.java.school.loop;

import java.util.Scanner;

public class FindMaxNumber {

	public static void main(String[] args) {
		/*
		 * n = 5
		 * number1 = 23
		 * number2 = 14
		 * number3 = 57
		 * number4 = 16
		 * number5 = 25
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.print("input n: ");
		int n = scanner.nextInt();
		int number =0;
		int max = 0;
		for(int i = 1; i<= n; i++) {
			System.out.print("number"+i +" = ");
			number = scanner.nextInt();
			if(max < number) {
				max = number;
			}
		}
		
		System.out.println("Max=" + max);

	}

}
