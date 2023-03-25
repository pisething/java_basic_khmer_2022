package com.piseth.java.school.continuedemo;

public class ContinueKeywordDemo {

	public static void main(String[] args) {
		// continue is used skip any step in loop
		// ex: print 1 to 10 but don't display number 4 and 6
		
		for(int i=1; i<=10; i++) {
			
			System.out.println(i);
			if(i == 4 || i == 6) {
				continue;
			}
			System.out.println("number" + i);
		}
	}

}
