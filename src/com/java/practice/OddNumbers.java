package com.java.practice;

import java.util.ArrayList;
import java.util.List;

public class OddNumbers {
	
	public static boolean onlyOddNumbers(List<Integer> list) {
		for (int i :list) {
			if(i%2!=0) {
			System.out.println("OddNumbers::: "+i);
					
		}
	}
		return true;
	}
	
	public static boolean onlyOddNumberjava8(List<Integer> list) {
	boolean list1=list.parallelStream().anyMatch(x -> x%2!=0);

	System.out.println("list1::"+list1);
	return list1;
	
	}		
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> list =new ArrayList<>();
		list.add(2);
		list.add(4);
		list.add(10);
		list.add(13);
		list.add(11);
		onlyOddNumbers(list);
		onlyOddNumberjava8(list);
		System.out.println("Before-List"+list);

	}

}
