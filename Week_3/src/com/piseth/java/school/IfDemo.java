package com.piseth.java.school;

public class IfDemo {

	public static void main(String[] args) {
		
		
		// input day number => output day name;
		// 1 => Monday
		// 7 => Sunday
		
		int dayNumber = 5;
		String dayName = "";
		if(dayNumber == 1) {
			dayName = "Monday";
		}else if(dayNumber == 2) {
			dayName = "Tueday"; 
		}else if(dayNumber == 3) {
			dayName = "Wednesday"; 
		}else if(dayNumber == 4) {
			dayName = "Thursday"; 
		}else if(dayNumber == 5) {
			dayName = "Friday"; 
		}else if(dayNumber == 6) {
			dayName = "Saturday"; 
		}else if(dayNumber == 7) {
			dayName = "Sunday"; 
		}else {
			dayName = "Invalid day number"; 
		}
		System.out.println("Using ifelse: "+ dayName);
		
	}

}
