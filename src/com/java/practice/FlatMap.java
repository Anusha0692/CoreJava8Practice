package com.java.practice;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMap {

	public static void main(String[] args) {
	//In Java, to convert a 2d array into a 1d array, we can loop the 2d array and put all the elements into a new array; 
		//Or we can use the Java 8 flatMap to flatten the 2d array into a 1d array, 
		//or from Stream<String[]> to Stream<String>.
		
		String[][] array = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}};

		  // Java 8  flatMap() is an intermediate operation and return another stream as method output return value.
		  String[] result = Stream.of(array)  // Stream<String[]>
		          .flatMap(Stream::of)        // Stream<String>
		          .toArray(String[]::new);    // [a, b, c, d, e, f]

		  for (String s : result) {
		      System.out.println(s);
		  }
		  
		  System.out.println("-----Filter out the 'a' from 2d Array-----");
		  
		  // filter out the a from 2d Array
		  List<String> collect = Stream.of(array)     // Stream<String[]>
		          .flatMap(Stream::of)                // Stream<String>
		          .filter(x -> !"a".equals(x))        // filter out the a
		          .collect(Collectors.toList());      // return a List

		  collect.forEach(System.out::println);

	}

}
