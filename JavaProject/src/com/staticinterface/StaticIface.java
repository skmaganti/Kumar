package com.staticinterface;

public interface StaticIface {
	static int m1() {
		return 48;
	}
	
	default int m2() {
		System.out.println("I am on interface");
		return 0;
	}
}
