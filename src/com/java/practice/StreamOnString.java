package com.java.practice;

import java.util.Map;
import java.util.stream.Collectors;

public class StreamOnString {

	public static void main(String[] args) {
		
		String input="hello hello";
	//Find the vowels in the string
		long vowelsCount=input.chars().filter((x)->{
			return (x=='a'|| x=='e' || x=='i'|| x=='o'|| x=='u');
		}).count();
		
		System.out.println("vowelsCount="+vowelsCount);
		
    //Find the duplicates in the string
		Map<String, Long> output =input.chars().mapToObj((x)->(char)x)
		.collect(Collectors.groupingBy(Object::toString,Collectors.counting()));
		output.forEach((key,value)->System.out.println(key+"=="+value));
	}
	

}
