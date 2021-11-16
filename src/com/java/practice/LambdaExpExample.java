package com.java.practice;

@FunctionalInterface
interface LambdaInterface{
	public int addInt(int a, int b);//Abstract
}

public class LambdaExpExample {
	


	public static void main(String[] args) {
		LambdaInterface ref= (int a, int b) ->{ return a+b;};
		System.out.println(ref.addInt(5,6));
	}
	

}
