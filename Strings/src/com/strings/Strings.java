package com.strings;

public class Strings {

	public static void main(String[] args) {
		String s = new String("Satish");
		s.concat("Kumar"); //new object is created and eligible for GC as it is not assigned/no reference variable
		System.out.println(s);
	}

}
