package com.interfacepackage;

public class MultiInt implements I1, I2{

	public static void main(String[] args) {
		new MultiInt().go();
	}
	
	void go() {
		System.out.println(doStuff());
	}
	
	public int doStuff() {
		return 3;
	}
}

//Implementing method must be marked as public. In this example doStuff is the implementing method 