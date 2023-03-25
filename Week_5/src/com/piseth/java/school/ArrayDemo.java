package com.piseth.java.school;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		
		//findAverage();
		//findMaximum();
		//checkNumberExistOrNot();
		//createArrayFromKeyboard();
		generateSequence1();
	}
	
	public static void generateSequence1() {
		//5 , 9, 13, 17, 21
		//4n + 5
		int[] a = new int[5];
		for(int i=0; i<a.length; i++) {
			a[i] = 4*i + 5;
		}
		System.out.println(Arrays.toString(a));
	}
	
	public static void createArrayFromKeyboard() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please input n: ");
		int n = scanner.nextInt();
		
		int[] a = new int[n];
		for(int i=0; i<n; i++) {
			System.out.print("Number "+ (i + 1) + ": ");
			a[i] = scanner.nextInt();
		}
		System.out.println(Arrays.toString(a));
	}
	
	public static void checkNumberExistOrNot() {
		int[] a = {50,60,70,55,65};
		int numberToFind = 60;
		int index = -1;
		for(int i = 0; i<a.length; i++) {
			if(numberToFind == a[i]) {
				index = i;
			}
		}
		
		if(index != -1) {
			System.out.println("Number exist");
		}else {
			System.out.println("Number does not exist");
		}
	}
	
	public static void findMaximum() {
		int[] a = {50,60,70,55,65};
		int max = a[0];
		for(int i = 1; i < a.length; i++) {
			if(max < a[i]) {
				max = a[i];
			}
		}
		System.out.println("Max=" + max);
	}
	
	public static void findAverage() {
		//System.out.println("average");
		int[] a = {50,60,70,55,65, 73};
		int numberOfElement = a.length;
		int total = 0;
		
		for(int n : a) {
			total += n;
		}
		
		double avg = (double)total/numberOfElement;
		System.out.println("avg=" + avg);
		
	}
	
	public static void test1() {
		/*
		 * datatype[] arrayname;
		 */
		
		//String[] name = new String[5];
		int[] score = new int[10];
		// initialize
		
		//int[] a = {1, 5, 30,40};
		//int[] a = new int[] {30, 40, 20,25};
		
		//System.out.println(a);
		//System.out.println(Arrays.toString(a));
		
		int[] b = new int[5];
		//String[] b = new String[4];
		//double[] b = new double[5];
		b[0] = 25;
		b[1] = 30;
		b[2] = 26;
		b[3] = 36;
		b[4] = 43;
		//b[5] = 20; // [0,4]
		//System.out.println(Arrays.toString(b));
		
		//System.out.println(b[-1]);
//		for(int i=0; i< b.length; i++) {
//			if(b[i]%2 == 0) {
//				System.out.println(b[i]);
//			}
//		}
		
		//System.out.println(b.length);
		for(int element : b) {
			//System.out.println(element);
		}
		
//		String[] names = {"Dara", "Thida","Seyha","Dalin"};
//		for(String n : names) {
//			System.out.println(n);
//		}
		
		// find sum
		int[] e = {50,20,30,40};
		int sum = 0;
//		for(int i=0; i<e.length; i++) {
//			sum += e[i];
//		}
//		System.out.println(sum);
		
		for(int num : e) {
			sum+= num;
		}
		System.out.println(sum);
	}

}
