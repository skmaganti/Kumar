package com.singletonpackage;

public class Test {
	private static Test t = new Test();
	private Test() {};
	public static Test getTest() {
		return t;
	}
	
	Test t1 = Test.getTest();
	Test t2 = Test.getTest();
}
