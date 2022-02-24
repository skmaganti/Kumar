package com.javaoperators;

public class StringConcat {

	public static void main(String[] args) {
		String s = "String";
		int b = 3;
		int c = 8;
		System.out.println(s+b+c);
		System.out.println(s+(b+c));
		String st = "123";
		st += "45";
		st += "67";
		System.out.println(st);
		int d = 2;
		System.out.println(""+d+3); //String concatenation
		System.out.println(d+3); //addition
		
	}

}
