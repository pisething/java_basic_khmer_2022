package com.piseth.java.school;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class FileInputStreamDemo {

	public static void main(String[] args) {
		byte[] myData = new byte[100];
		try {
			InputStream input = new FileInputStream("C:\\DATA\\tmp\\test\\data.txt");
			
			//int letter = input.read();
			//System.out.println((char)letter);
			input.skip(14);
			input.read(myData);
			
			//input.read();
			
			System.out.println(input.available());
			//input.read(myData);
			//System.out.println(Arrays.toString(myData));
			
			 // for(byte b : myData) { System.out.print(b); }
			 
			String data = new String(myData);
			System.out.println(data);
			//System.out.println(input.available());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
