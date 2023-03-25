package com.piseth.java.school;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileReaderDemo {

	public static void main(String[] args) {
		char[] data = new char[100];
		try {
			Reader reader = new FileReader("C:\\DATA\\tmp\\test\\data.txt");
			System.out.println(reader.ready());
			reader.read(data);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
