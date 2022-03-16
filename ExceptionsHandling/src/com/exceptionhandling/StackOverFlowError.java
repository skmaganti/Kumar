package com.exceptionhandling;

public class StackOverFlowError {
	public static void m1()
	{
		m2();
	}
	public static void m2()
	{
		m1();
	}
	public static void main(String[] args) {
		m1();
	}

}
//If recursive method call exists then there is chance of stackoverflow error