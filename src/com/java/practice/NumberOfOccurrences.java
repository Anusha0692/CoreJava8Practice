package com.java.practice;

import java.util.HashMap;
import java.util.Map;

public class NumberOfOccurrences {

	public static void main(String[] args) {
	
		//String str="Alice is girl and Bob is boy";
		
		String str="Alice is girl and Bob is boy";
		
		Map<String, Integer> hashMap =new HashMap<>();
		
        String[] words = str.split(" ");
        
        for(String word : words) {
        	
        	if(hashMap.containsKey(word)) {
        		hashMap.put(word, hashMap.get(word)+1);
        	}else {
        		hashMap.put(word, 1);
        	}
        }
        for(Map.Entry entry : hashMap.entrySet()) {
       System.out.println(entry.getKey()+"=="+entry.getValue());
       
        }
        //System.out.println('b'+'i'+'t');
	}

}
