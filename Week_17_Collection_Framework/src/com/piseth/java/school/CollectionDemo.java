package com.piseth.java.school;

import java.util.ArrayList;
import java.util.Comparator;

public class CollectionDemo {

	public static void main(String[] args) {
		ArrayList<String> namesList = new ArrayList<>();
		// Add element
		namesList.add("Dara");
		namesList.add("Thida");
		namesList.add("Cheata");
		
		//System.out.println(namesList);
		// Access element
		/*
		String name = namesList.get(1);
		System.out.println(name);
		
		//update element
		namesList.set(1, "Vannda");
		System.out.println(namesList);
		// remove element
		//namesList.remove(0);
		System.out.println(namesList);
		
		System.out.println(namesList.size());
		
		Comparator<String> compareAsc = new Comparator<String>() {
			
			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
		};
		namesList.sort(compareAsc);
		System.out.println("=======");
		System.out.println(namesList);
		
		*/
		
		//boolean exist = namesList.contains("thida");
		//System.out.println(namesList.indexOf("Dary"));
		//System.out.println(namesList);
		/*
		for(int i=0; i<namesList.size(); i++) {
			System.out.println( i + "=>"+ namesList.get(i));
		}
		*/
		for(String name : namesList) {
			System.out.println(name);
		}
	}

}
