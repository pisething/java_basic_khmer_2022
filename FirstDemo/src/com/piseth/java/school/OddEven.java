package com.piseth.java.school;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		// input number: 6
		// Even
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input number: ");
		int number = scanner.nextInt();
		
		int remainder = number%2 ;
		if(remainder == 0) {
			System.out.println("Even");
		}
		
		if(remainder == 1){
			System.out.println("Odd");
		}
		
	}

}
