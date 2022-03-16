package com.exceptionhandling;

public class IllegalStateException {

	public static void main(String[] args) {
		Thread t = new Thread();
		t.start(); //calling at the beginning is acceptable
		t.start(); //calling again is not acceptable
	}

}
