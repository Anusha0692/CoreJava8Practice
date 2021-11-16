package com.java.practice;

@FunctionalInterface
interface LearningLambdaExp{
	public void learn();// An interface which is having only one abstract method is called functional Interface.
}

/*public class LambdaExp implements LearningLambdaExp{

	public static void main(String[] args) {
		LambdaExp lam =new LambdaExp();
		lam.learn();

	}

	@Override
	public void learn() {
		System.out.println("Learning Lambda expression");
	}

}*/

public class LambdaExp {
	
	public static void main(String[] args) {
		
	LearningLambdaExp ref= () -> {
		System.out.println("Learning Lambda expression");
	};
	
	ref.learn();
	}
}
