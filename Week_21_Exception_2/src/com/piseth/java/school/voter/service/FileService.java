package com.piseth.java.school.voter.service;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileService {
	
	public static void save(String data) {
		File file = new File("C:/DATA/tmp/voters.txt");
		try {
			FileWriter fileWriter = new FileWriter(file);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			bufferedWriter.write(data);
			bufferedWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
