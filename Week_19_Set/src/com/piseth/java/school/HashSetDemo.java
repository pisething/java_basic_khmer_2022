package com.piseth.java.school;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		/*
		 * HashSet<String> names = new HashSet<>(); names.add("Dara");
		 * names.add("Thida"); names.add("Cheata"); //names.add("Dara");
		 * 
		 * System.out.println(names);
		 * 
		 * List<String> list1 = new ArrayList<>(); list1.add("Seyha");
		 * list1.add("Lida");
		 * 
		 * names.addAll(list1); System.out.println(names); names.remove("Lida");
		 * 
		 * Iterator<String> iterator = names.iterator(); while(iterator.hasNext()) {
		 * String name = iterator.next(); System.out.println(name); }
		 */
		
		Set<Integer> set1 = new HashSet<>();
		set1.add(23);
		set1.add(33);
		set1.add(43);
		
		Set<Integer> set2 = new HashSet<>();
		//set2.add(40);
		//set2.add(50);
		set2.add(43);
		set2.add(23);
		
		//set1.addAll(set2);
		//set1.retainAll(set2);
		//set1.removeAll(set2);
		boolean containsAll = set1.containsAll(set2);
		
		System.out.println(containsAll);
		
		
	}

}
