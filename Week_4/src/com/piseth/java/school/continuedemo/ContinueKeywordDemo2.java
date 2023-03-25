package com.piseth.java.school.continuedemo;

import java.util.Scanner;

public class ContinueKeywordDemo2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input n: ");
		int n = scanner.nextInt();
		String text = "";
		for(int i =0; i<n; i++) {
			System.out.print("Word-"+ (i+1) + ": ");
			String word = scanner.next();
			int lastIndex = word.length() - 1;
			char lastLetter = word.charAt(lastIndex);
			char ch = Character.toLowerCase(lastLetter);
			if(Character.isAlphabetic(lastLetter)) {
				if(ch != 'a' && ch != 'e' & ch != 'i' & ch != 'o' & ch != 'u') {
					text += word + " ";
				}
			}
		}
		System.out.println(text);
		
		
		//String t = "School";
		//System.out.println(t.charAt(5));
		//System.out.println(t.length());
		//int lastIndex = t.length() - 1;
		//System.out.println(t.charAt(lastIndex));
		
		/*
		char ch = 'E';
		//System.out.println(Character.isAlphabetic(ch));
		
		//'a','e','i','o','u';
		ch = Character.toLowerCase(ch);
		if(Character.isAlphabetic(ch)) {
			if(ch != 'a' && ch != 'e' & ch != 'i' & ch != 'o' & ch != 'u') {
				System.out.println("Consonant");
			}else {
				System.out.println("Vowel");
			}
		}else {
			System.out.println("Not Letter");
		}
		
		*/
		
	}

}
