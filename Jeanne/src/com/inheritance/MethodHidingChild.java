package com.inheritance;

public class MethodHidingChild {
	public static void eat() {
		System.out.println("child is eating");
	}
	public static void main(String[] args) {
		MethodHidingChild.eat();
	}

}
