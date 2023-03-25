package com.piseth.java.school;

import java.util.Scanner;

public class SumTwoNumber2 {

	public static void main(String[] args) {
		// Input number 1: 
		// Input number 2: 
		// Sum = 70
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Input Number 1: ");
		int num1 = scanner.nextInt();
		
		System.out.print("Input Number 2: ");
		int num2 = scanner.nextInt();
		
		int total = num1 + num2;
		System.out.println("Sum = " + total);
		
		
	}

}
