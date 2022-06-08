package com.interfacepackage;

public class Tablet extends Electronic implements Gadget{
	public void doStuff() {
		System.out.println("show book");
	}
	public static void main(String[] args) {
		new Tablet().getPower();
		new Tablet().doStuff();
	}
}
