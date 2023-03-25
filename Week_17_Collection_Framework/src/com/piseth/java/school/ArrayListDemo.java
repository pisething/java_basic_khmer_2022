package com.piseth.java.school;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<Integer> ages = new ArrayList<>();
		ages.add(25);
		ages.add(13);
		ages.add(23);
		System.out.println(ages);
		System.out.println(ages.get(2));
	}
}
