package com.practiceexercise;

public class LambdaExpressionTest {
	public static void main(String[] args) {
		TestInterf testInterf = ()->System.out.println("Test Method");
		testInterf.test();
	}
}
