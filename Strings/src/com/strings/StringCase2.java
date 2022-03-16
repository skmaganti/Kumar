package com.strings;

public class StringCase2 {

	public static void main(String[] args) {
		String s1 = new String("Satish");
		String s2 = new String("Satish");
		System.out.println(s1==s2); //double equals operator meant for reference comparison
		System.out.println(s1.equals(s2));//In the String child class, equals method is overriden from object class for content comparison
	}

}
