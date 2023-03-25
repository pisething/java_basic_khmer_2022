package com.piseth.java.school;

public class ThrowDemo {

	public static void main(String[] args){
		int age = 19;
		if(age < 18) {
			throw new RuntimeException("Age under 18 cannot vote");
		}
		System.out.println("Can vote");
	}

}
