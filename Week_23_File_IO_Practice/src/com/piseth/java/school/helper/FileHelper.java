package com.piseth.java.school.helper;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileHelper {
	private static String fileName = "C:\\DATA\\Documents\\Teaching\\student_file\\students.txt";
	
	public static void saveToFile(String data) {
		File file = new File(fileName);
		try {
			FileWriter fileWriter = new FileWriter(file, true);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			bufferedWriter.write(data);
			bufferedWriter.newLine();
			bufferedWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static List<String> readData(){
		File file = new File(fileName);
		List<String> dataList = new ArrayList<>();
		try {
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			
			String line = null;
			do {
				line = bufferedReader.readLine();
				if(line != null) {
					dataList.add(line);
				}
				//System.out.println(line);
			}while(line != null);
			bufferedReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return dataList;
	}
}
