package com.piseth.java.school;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		System.out.println("First line");
		int a = 0;
		int b = 5;
		String[] name = {"Dara","Thida"};
		try {
			System.out.println("Before result");
			int result = b/a;
			System.out.println("Result=" + result);
		}catch(ArithmeticException e) {
			System.out.println("Error occured");
		}
		finally {
			//System.out.println(name[2]);
			System.out.println("===End of result===");
		}
		
		System.out.println("Second line");
	}

}
