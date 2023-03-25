package com.piseth.java.school;

import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		TreeMap<String, Integer> fruitMap = new TreeMap<>();
		
		fruitMap.put("banana", 15);
		fruitMap.put("mango", 10);
		fruitMap.put("orange", 14);
		fruitMap.put("apple", 25);
		fruitMap.put("test", 95);
		
		System.out.println(fruitMap);
		
		//System.out.println(fruitMap.firstKey());
		//System.out.println(fruitMap.lastKey());
		
		//System.out.println(fruitMap.firstEntry());
		//System.out.println(fruitMap.lastEntry());


		//System.out.println(fruitMap.higherKey("banana"));
		//System.out.println(fruitMap.lowerKey("mango"));
		
		
		//System.out.println(fruitMap.ceilingKey("mango"));
		//System.out.println(fruitMap.floorKey("mango"));
		
		//System.out.println(fruitMap.higherEntry("mango"));
		
		//System.out.println(fruitMap.get("mango"));
		//System.out.println(fruitMap.pollLastEntry());
		
		//System.out.println(fruitMap);
		//SortedMap<String, Integer> headMap = fruitMap.headMap("mango", true);
		//System.out.println(headMap);
		
		//System.out.println(fruitMap.tailMap("banana", false));
		
		//System.out.println(fruitMap.subMap("banana", "orange"));
		
		System.out.println(fruitMap.subMap("banana", false, "orange",true));
		
		
	}

}
