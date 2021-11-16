package com.java.practice;

public class Hello {
	
	public static String m1(String a) {
		System.out.println("Hello.m1()"+a);
		return a;
		
	}
	
	public Object m1(Object o1) {
		System.out.println("Hello.obj()"+o1);	
		return o1;
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		m1(null);
		System.out.println("Hello.main()");

	}

}
