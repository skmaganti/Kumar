package com.exceptionhandling;

public class ThrowClass {

	public static void main(String[] args) {
		throw new ArithmeticException("/ by zero");
		//System.out.println("Hello"); compile time error(unreachable code) because after throw statement we can't write anything
	}

}
