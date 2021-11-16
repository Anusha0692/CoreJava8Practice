package com.java.practice;

public class ReverseString {
	
	public static String reverse(String name ) {
		
		String reverse="";
		for (int i=name.length()-1; i>=0; i--) {
			reverse= reverse+name.charAt(i);
		}
		return reverse;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String reverseSring=reverse("Anusha");
		System.out.println("ReverseString:::::"+reverseSring);
	}

}
