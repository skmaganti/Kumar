package com.stringbuffer;

public class MyString {
	String msg;
	MyString(String msg){
		this.msg = msg;
	}
//	public String toString() {
//		return msg;
//	}
	public static void main(String[] args) {
		System.out.println("Hello "+new StringBuilder("Java 8"));
		System.out.println("Hello "+new MyString("Java 8"));
	}

}
