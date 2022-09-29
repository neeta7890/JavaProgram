package com.basics;
import java.util.*;
public class SortMapByValues {

	public static void main(String[] args) {
		Map<String, Integer> hashmap = new HashMap<>();
		hashmap.put("Avocado", 80);
		hashmap.put("Honeydew", 60);
		hashmap.put("Blueberries", 45);
		hashmap.put("Cranberries", 60);
		hashmap.put("Mango", 75);

		System.out.println("The original array before sorting:");
		hashmap.forEach((key,value)->System.out.println(key + " -> " + value));
			
		System.out.println("\nAfter sorting by their prices:");
		
		List<Map.Entry<String, Integer>> list = new ArrayList<>(hashmap.entrySet());
		
		list.sort(Map.Entry.comparingByValue());
			
		list.forEach((fruit)->System.out.println(fruit.getKey() + " -> " + fruit.getValue()));
	}
}
