package com.singletonpackage;

public class TestClass {
	private static TestClass t = null;
	public TestClass() {};
	public static TestClass getTest() {
		if(t==null) {
			t = new TestClass();
		}
		return t;
	}
		Test t1 = Test.getTest();
		Test t2 = Test.getTest();
}
