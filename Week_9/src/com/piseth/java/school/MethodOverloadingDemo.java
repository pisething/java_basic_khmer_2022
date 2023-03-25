package com.piseth.java.school;

public class MethodOverloadingDemo {
	
	public static void main(String[] args) {
//		print("Welcome to Cambodia");
//		
//		print(23);
//		print("Amount", 50);
		
		//int[] a = {46,89,34,23};
		//print(a);
		
		//printNumber(60,45,23,12,22,50);
		
		display("Coca", 23.12,50.3,56.3);
		
		//System.out.pr
		
	}
	
	public static void display(String name, double... price) {
		System.out.println(name);
		for(int i=0; i<price.length; i++) {
			System.out.println(price[i]);
		}
	}
	
	public static void printNumber(int... numbers) {
		for(int n : numbers) {
			System.out.println(n);
		}
	}
	
	public static void print(int[] numbers) {
		for(int n : numbers) {
			System.out.println(n);
		}
	}
	
	public static void print(String property, int value) {
		System.out.println(property + "=" + value);
	}
	
	public static void print(String text) {
		System.out.println(text);
	}
	
	public static void print(int number) {
		System.out.println(number);
	}
	
	/*
	public static void printString(String text) {
		System.out.println(text);
	}
	
	public static void printInteger(Integer number) {
		System.out.println(number);
	}
*/
}
