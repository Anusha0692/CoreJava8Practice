package com.java.practice;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatedCharacter {
	
	public static void main(String[] args) {
		String s ="anusha";
		
		HashMap<Character,Integer> map =new HashMap<>();
		
		for(int i=0; i<s.length();i++) {
			char c= s.charAt(i);
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}else {
				map.put(c, 1);
			}
		}
  for(Map.Entry entry : map.entrySet()) {
	  System.out.println(entry.getKey()+"=="+entry.getValue());
  }

}

}
