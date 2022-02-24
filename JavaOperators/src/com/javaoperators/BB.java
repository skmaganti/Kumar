package com.javaoperators;

import com.selftest.Foo;

public class BB extends AA{
	
	public static void main(String[] args) {
	AA a = new AA();
	BB b = new BB();
	if(b instanceof Foo) {
		System.out.println("b is instance of Foo");
	}
}
}
