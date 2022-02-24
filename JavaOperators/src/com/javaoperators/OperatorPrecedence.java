package com.javaoperators;

public class OperatorPrecedence {

	public static void main(String[] args) {
		System.out.println(false == false);
		System.out.println(true&true);
		System.out.println(true|true);
		System.out.println(true & false == false | true);
		System.out.println(true | false == false & false);
		System.out.println(false & false == false | true);
	}

}
