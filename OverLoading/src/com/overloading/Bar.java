package com.overloading;

public class Bar extends Foo{
	String go(int x) { //Method overloading
//		String go() { -- This method is not going to compile as there are no arguments 
		//inside go method and only return type can't be changed
		return null;
	}
}
