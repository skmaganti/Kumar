package com.stringbuffer;

public class Test {
	public String toString() {
		return "Test Object";
	}
	public static void main(String[] args) {
		Test t1 = new Test();
		System.out.println(t1);
		System.out.println("Hello "+t1);
	}

}
 //In all String class, string buffer, string builder class, wrapper class, collection class -- toString() method is overridden with meaningful representation