package com.defaultinterface;

public class App implements DefaultInterfaceClass {

	@Override
	public void abs() {
		System.out.println("Hi");
	}

	public static void main(String[] args) {
		DefaultInterfaceClass dic = new App();
		dic.abs();
		System.out.println(dic.m1());
	}
}


//Default methods must have a method body
//Default methods cannot be marked as static,protected,private or final, abstract