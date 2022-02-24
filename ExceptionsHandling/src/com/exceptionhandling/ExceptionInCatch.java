package com.exceptionhandling;

public class ExceptionInCatch {

	public static void main(String[] args) {
		try {
			System.out.println("try");
			System.out.println(10/0);
		} catch(Exception e) {
//			System.out.println(10/0);
			System.out.println(e);
		} finally {
			System.out.println("Finally");
//			System.out.println(10/0);
		}
		System.out.println("Hi");
	}

}
