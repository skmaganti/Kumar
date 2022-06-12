package com.practiceexercise;

public class LambdaExpressionTest2 {

	public static void main(String[] args) {
		TestInterface2 testInterface = value->value*value;
		System.out.println(testInterface.checkTotal(10));
	}

}
