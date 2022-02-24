package com.exceptionhandling;

public class ThrowObjectClass {
	static ArithmeticException e = new ArithmeticException();
	public static void main(String[] args) {
		throw e;
	}

}
