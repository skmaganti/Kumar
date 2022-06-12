package com.practiceexercise;

public class LambdaExpressionTest1 {

	public static void main(String[] args) {
		TestFuncInterface1 testFuncInterface = (s1,s2)->System.out.println(s1.equalsIgnoreCase(s2));
		testFuncInterface.testMethod1("Satish", "Kumar");
	}

}
