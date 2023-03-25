package com.piseth.java.school;

import java.util.Scanner;

public class WhileLoopDemo2 {

	public static void main(String[] args) {
		// get n number from keyboard and sum
		/*
		 * n = 5
		 * number1: 34
		 * number2: 20
		 * 
		 * 
		 * number5: 50
		 * total = ?
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please inpout n: ");
		int n = scanner.nextInt();
		int i = 1;
		int total = 0;
		while(i <= n) {
			System.out.print("Number"+i +": ");
			int number = scanner.nextInt();
			// sum only even number
			if(number%2 == 0) {
				//total = total + number;
				total += number;
			}
			i++;
		}
		
		System.out.println("Total="+ total);
				
	}

}
