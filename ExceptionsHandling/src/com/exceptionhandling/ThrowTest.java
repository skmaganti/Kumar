package com.exceptionhandling;

public class ThrowTest {
	static ArithmeticException e;
	public static void main(String[] args) {
		throw e; // Since object e is not assigned so default value is NULL
	}

}
