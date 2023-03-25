package com.piseth.java.school;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileWriterDemo {

	public static void main(String[] args) {
		try {
			String text ="Piseth Java School.";
			Writer writer = new FileWriter("C:/DATA/tmp/test/data2.txt", true);
			writer.write(text);
			//writer.flush();
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
