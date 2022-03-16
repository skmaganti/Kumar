package com.strings;

public class StringMethods {

	public static void main(String[] args) {
		String s = "mhaganti";
		 s = s.replace('m', 'c');
		System.out.println(s);
		s = s.substring(4);
		System.out.println(s);
		s = s.substring(0, 3); //being to end - 1
		System.out.println(s);
		System.out.println(s.indexOf('n'));
		System.out.println(s.lastIndexOf('t'));
	}

}
