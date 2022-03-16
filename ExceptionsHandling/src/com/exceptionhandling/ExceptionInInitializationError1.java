package com.exceptionhandling;

public class ExceptionInInitializationError1 {

	static {
		String s = null;
		System.out.println(s.length());
	}
	
	public static void main(String[] args) {
		
	}

}
