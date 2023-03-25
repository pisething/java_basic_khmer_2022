package com.piseth.java.school;

import java.util.Scanner;

public class Utils {
	public static String getString(String label) {
		System.out.print(label);
		Scanner scanner = new Scanner(System.in);
		return scanner.next();
	}

	public static double getDouble(String label) {
		String text = getString(label);
		return Double.parseDouble(text);
	}
}
