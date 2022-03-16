package com.exceptionhandling;

public class NumberFormatException {

	public static void main(String[] args) {
		int i = Integer.parseInt("10"); //Here we are converting string to a number and we are seeing number only so no problem
		System.out.println(i);
		//int i = Integer.parseInt("ten"); // Integer.parseInt is used to convert string to a number but here string converting to number is not representing as a number
	}

}
