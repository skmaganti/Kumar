package com.strings;

public class StringBufferCase2 {

	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("Satish");
		StringBuffer sb2 = new StringBuffer("Satish");
		System.out.println(sb1==sb2);
		System.out.println(sb1.equals(sb2)); //In the StringBuffer child class, equals method is used for reference comparison since overriden is not taken here. Object class method will execute
	}

}
