package com.piseth.java.school;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CheckedExceptionDemo {

	public static void main(String[] args) {
		File file = new File("C:/DATA/tmp/person.txt");
		try {
			Scanner scanner = new Scanner(file);
			while(scanner.hasNext()) {
				System.out.println(scanner.nextLine());
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
