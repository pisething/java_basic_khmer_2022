package com.piseth.java.school;

public class SwitchDemo {

	public static void main(String[] args) {
		
		/*
		 * switch(expression){
		 * case case1: statement; break;
		 * case case2: statement; break;
		 * case case3: statement; break;
		 * ....
		 * [default: statement;]
		 * }
		 * 
		 * 
		 * 
		 * 
		 */
		
		// input day number => output day name;
		// 1 => Monday
		// 7 => Sunday
		
		int dayNumber = 5;
		String dayName = "";
		switch(dayNumber) {
		case 1: dayName = "Monday"; break;
		case 2: dayName = "Tueday"; break;
		case 3: dayName = "Wednesday"; break;
		case 4: dayName = "Thursday"; break;
		case 5: dayName = "Friday"; break;
		case 6: dayName = "Saturday"; break;
		case 7: dayName = "Sunday"; break;
		default: dayName = "Invalid day number";
		}
		
		System.out.println(dayName);
		
	}

}
