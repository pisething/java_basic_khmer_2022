package com.piseth.java.school;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileOutputStreamDemo {

	public static void main(String[] args) {
		try {
			//String text = "Piseth Java School 2023";
			String text ="Write text file from output stream";
			OutputStream output = new FileOutputStream("C:/DATA/tmp/test/data2.txt", true);
			output.write(text.getBytes(), 11, 9);
			//output.write("I am from Cambodia".getBytes());
			output.close();
			System.out.println("Finish");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
