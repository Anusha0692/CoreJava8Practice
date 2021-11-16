package com.java.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=new ArrayList<Integer>();
		list.add(2);
		list.add(3);
		list.add(2);
		list.add(4);
		list.add(4);
		list.add(5);
		list.add(5);
		System.out.println("list of numbers::"+list);
		Set<Integer> withoutDuplicates =new LinkedHashSet<Integer>(list);
		list.clear();
		list.addAll(withoutDuplicates);
		System.out.println("ListOfNumbers without duplicates:::"+list);
		
		List names=Arrays.asList("a","b","c","a","d","a","b","c","d");
		System.out.println("listwithduplicates::"+names);
		System.out.println(names.stream().distinct().collect(Collectors.toList()));
		
	}
	

}
