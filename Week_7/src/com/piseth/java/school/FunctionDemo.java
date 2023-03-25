package com.piseth.java.school;

import java.util.Scanner;

public class FunctionDemo {

	public static void main(String[] args) {
		int[] a = {50,60,20,35,10};
		int[] b = {200,40,250,50};
		int[] c = {};
		
		//String[] names = {"Dara","Thida"};
		
		//printArray(a);
		//printArray(names);
		//sayWelcomeV2("Canada");
		//sayWelcomeV2();
		//sumArray(a); // 175
		//sumArray(b); // 540
		//2 pow 4
		// 3 pow 2
		//power(2, 3);
		//max(c);
		//getArray(3);
		
		//int t = sumArray(a) + sumArray(b);
		//int total =  sumArrayV2(a) * sumArrayV2(b);
		//System.out.println(total);
		
		// (2 pow 3) + (5 pow 2)
		
		//int t = power(2, 3) + power(5,2);
		//System.out.println(t);
		
		double total = Math.pow(2, 3);
		System.out.println(total);
		
	}
	
	public static int sumArrayV2(int[] arr) {
		int total = 0;
		for(int n : arr) {
			total += n;
		}
		return total;
	}
	
	// get array n element from keyboard
	
	public static void getArray(int n) {
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[n];
		for(int i =0; i<n; i++) {
			System.out.print("Element " + (i +1) + ": ");
			arr[i] = scanner.nextInt();
		}
		// print array
		//printArray(arr);
	}
	
	public static void max(int[] arr) {
		if(arr.length != 0) {
			int maxNumber = arr[0];
			for(int i =1; i<arr.length; i++) {
				if(maxNumber < arr[i]) {
					maxNumber = arr[i];
				}
			}
			System.out.println(maxNumber);
		}else {
			System.out.println("Array empty");
		}
		
	}
	
	public static int power(int n, int m) {
		int result = 1;
		for(int i=0; i<m; i++) {
			result = result * n;
		}
		//System.out.println(result);
		return result;
	}
	
	public static void sumArray(int[] arr) {
		int total=0;
		for(int i=0; i<arr.length; i++) {
			total += arr[i];
		}
		System.out.println("Total="+total);
	}
	
	public static void printArray(int[] a) {
		for(int n : a) {
			System.out.print(n + ", ");
		}
	}
	
	public static void printArrayOld() {
		int[] a = {25,26,34,36,21};
		for(int n : a) {
			System.out.println(n);
		}
	}
	
	public static void sumArrayElement() {
		int[] a = {25,26,34,36,21};
		int total = 0;
		for(int n : a) {
			total += n;
		}
		System.out.println(total);
	}
	
	//print welcome to Cambodia
	
	public static void sayWelcome() {
		System.out.println("Welcome to Cambodia");
	}
	
	public static void sayWelcomeV2(String countryName) {
		System.out.println("Welcome to " + countryName);
	}

}
