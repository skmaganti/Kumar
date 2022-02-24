package com.staticmodifiers;

public class Test {
	static int x = 10;
	int y = 20;
	public static void main(String[] args) {
		Test t1 = new Test();
		t1.x = 12;
		t1.y = 14;
		System.out.println(t1.x+" "+t1.y);
		Test t2 = new Test();
		System.out.println(t2.x + " "+t2.y);
	}

}
