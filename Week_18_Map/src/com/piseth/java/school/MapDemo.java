package com.piseth.java.school;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		// apple = 25
		// banana = 15
		// mango = 10.5

		HashMap<String, Double> fruitMap = new HashMap<>();

		fruitMap.put("banana", 15.0);
		fruitMap.put("mango", 10.3);
		fruitMap.put("apple", 25.0);
		fruitMap.put("orange", 14.6);

		System.out.println(fruitMap);

		// Double price1 = fruitMap.get("banaka");
		// Double price1 = fruitMap.getOrDefault("orange", 0.1);
		// System.out.println(price1);

		// fruitMap.put("banana", 20.0);
		// fruitMap.replace("banana", 15.0,200.5);
		// fruitMap.remove("banana", 15.0);
		// boolean exist = fruitMap.containsKey("banana4");
		// System.out.println(exist);
		// System.out.println(fruitMap);

		// System.out.println(fruitMap.keySet());
		// System.out.println(fruitMap.values());
		// System.out.println(fruitMap.entrySet());

		// Set<String> keys = fruitMap.keySet();
		/*
		 * for(String key : fruitMap.keySet()) { System.out.println(key); }
		 */

		// Collection<Double> values = fruitMap.values();
		/*
		 * for(Double v : fruitMap.values()) { System.out.println(v); }
		 */

		// Set<Entry<String, Double>> entrySet = fruitMap.entrySet();

		for (Entry<String, Double> entry : fruitMap.entrySet()) {
			System.out.println(entry.getKey() + "==>" + entry.getValue());
		}
		
		System.out.println(fruitMap);

		/*
		 * System.out.println(fruitMap); HashMap<String, Double> map2 = new
		 * HashMap<>(fruitMap); map2.put("test", 30.6); System.out.println(map2);
		 */

	}

}
