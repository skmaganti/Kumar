package com.javaoperators;

public class B extends A{

	public static void main(String[] args) {
		A a = new B();
		testMethod(a);
		((B)a).doBStuff();
		B b = new B();
		if(b instanceof Object) {
			System.out.println("b is definitely an object");
		}
	}
	
	public static void testMethod(A satish) {
		if(satish instanceof B) {
			((B)satish).doBStuff();
		}
	}
	
	public static void doBStuff() {
		System.out.println("'a' refers to a B");
	}
}
