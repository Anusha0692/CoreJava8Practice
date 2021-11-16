package com.java.practice;

public class FibonacciExample1 {
	static int n1=0,n2=1,n3=0;
	static void printFibnacci(int count) {
		if(count>0) {
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.println(" "+n3);
			printFibnacci(count-1);
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count=10;
		System.out.println("FibonacciExample1.main()"+n1+""+n2);
		
		printFibnacci(count-2);
	}

}
