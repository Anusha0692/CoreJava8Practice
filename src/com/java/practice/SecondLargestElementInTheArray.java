package com.java.practice;

import java.util.Arrays;

public class SecondLargestElementInTheArray {
	
	 public static void main(String[] args) {

		 int a[] = {1,2,3,9,5,7,6,4,8};
		 Arrays.sort(a);
		 int aa = a[a.length -2 ];
		 System.out.println(aa);

}
}
