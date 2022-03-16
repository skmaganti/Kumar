package com.exceptionhandling;

public class IllegalArgumentException {

	public static void main(String[] args) {
		Thread t = new Thread();
		t.setPriority(10); //range is from 0 to 10
		t.setPriority(20);
	}

}
