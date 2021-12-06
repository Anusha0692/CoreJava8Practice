package com.java.practice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortHashMapInJava8 {

	public static void main(String[] args) {
		// a Map with string keys and integer values
	    Map<String, Integer> budget = new HashMap<>();
	    budget.put("clothes", 120);
	    budget.put("grocery", 150);
	    budget.put("transportation", 100);
	    budget.put("utility", 130);
	    budget.put("rent", 1150);
	    budget.put("miscellneous", 90);

	    System.out.println("map before sorting: " + budget);
	 // above code can be cleaned a bit by using method reference
	 // now, let's collect the sorted entries in Map Map<String, Integer> sortedByPrice = ItemToPrice.entrySet() .stream() .sorted(Map.Entry.<String, Integer>comparingByValue()) .collect(Collectors.toMap(e -> e.getKey(),e -> e.getValue()));

	    Map<String, Integer> sortedByValue = budget.entrySet().stream()
	    		.sorted(Map.Entry.<String, Integer>comparingByValue()) 
	    		.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

	    System.out.println("Map sorted by value in increasing order: " + sortedByValue);
	}
	

	
}
