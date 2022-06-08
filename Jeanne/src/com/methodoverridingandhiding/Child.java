package com.methodoverridingandhiding;

public class Child {
	public static int myAge(int age) {
		return age = 20;
	}
	public static void main(String[] args) {
		Parent parent = new Parent();
		System.out.println(parent.myAge(12));
	}

}
