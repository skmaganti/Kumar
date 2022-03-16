package com.strings;

public class StringCase5 {

	public static void main(String[] args) {
		String s1 = new String("Spring"); //two objects
		s1.concat("Fall"); // two objects
		String s2 = s1.concat("Winter"); //two objects
		s2.concat("Summar");//two objects
		System.out.println(s1);
		System.out.println(s2);
	}

}
