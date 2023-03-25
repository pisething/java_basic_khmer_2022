package com.piseth.java.school.breakdemo;

import java.util.Scanner;

public class BreakKeywordDemo2 {

	public static void main(String[] args) {
		//input any number nonstop if not even number
		/*
		 * number1: 13
		 * number2: 57
		 * number3: 15
		 * 
		 * 
		 * number9: 24
		 * 
		 */
		
		Scanner scanner = new Scanner(System.in);
		int i = 1;
		while(true) {
			System.out.print("Number"+i + ": ");
			int number = scanner.nextInt();
			i++;
			if(number % 2 == 0) {
				break;
			}
		}

	}

}
