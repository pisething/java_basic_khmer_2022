package com.piseth.java.school;

import java.util.Scanner;

public class GetNumberOfDay {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input Month: ");
		int month = scanner.nextInt();
		int numberOfDay = 0;
		switch(month) { 
		case 1: 
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			numberOfDay = 31; break;
		case 4: 
		case 6:
		case 9:
		case 11:
			numberOfDay = 30; break;
		case 2: 
			System.out.print("Input year: ");
			int year = scanner.nextInt();
			if(year%4 == 0) {
				numberOfDay = 29; 
			}else {
				numberOfDay = 28; 
			}
		}
		
		if(numberOfDay != 0) {
			System.out.println("Number of day =" + numberOfDay);
		}else {
			System.out.println("Invalid month");
		}
		
	}
	
	
	

}
