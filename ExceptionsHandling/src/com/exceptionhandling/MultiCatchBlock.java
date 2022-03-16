package com.exceptionhandling;

public class MultiCatchBlock {

	public static void main(String[] args) {
		try {
			System.out.println(10/0);
		}
		catch(ArithmeticException | NullPointerException e) { //multiple exceptions in catch block from 1.7v
			e.printStackTrace();
		}
	}

}
