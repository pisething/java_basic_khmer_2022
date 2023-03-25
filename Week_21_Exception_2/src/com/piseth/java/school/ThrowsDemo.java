package com.piseth.java.school;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ThrowsDemo {

	public static void main(String[] args) throws FileNotFoundException{
		readFile2();
	}
	
	public static void readFile() {
		File file = new File("C:/DATA/tmp/person2.txt");
		try {
			Scanner scanner = new Scanner(file);
			while(scanner.hasNext()) {
				System.out.println(scanner.nextLine());
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("====== file not found ===");
		}
	}
	
	public static void readFile2() throws FileNotFoundException{
		File file = new File("C:/DATA/tmp/person.txt");
		Scanner scanner = new Scanner(file);
		while(scanner.hasNext()) {
			System.out.println(scanner.nextLine());
		}
		
	}

}
