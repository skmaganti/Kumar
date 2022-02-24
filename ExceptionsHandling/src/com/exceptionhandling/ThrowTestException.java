package com.exceptionhandling;

	public class ThrowTestException extends RuntimeException{ // if class is not extended then throw keyword will not take class object

	public static void main(String[] args) {
		throw new ThrowTestException();
	}

}
