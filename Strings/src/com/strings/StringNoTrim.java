package com.strings;

public class StringNoTrim {

	public static void main(String[] args) {
		String s = "Satish Kumar";
		System.out.println(s.trim());
		System.out.println(s.length());
		System.out.println(s.trim().length()); //trim function works for start and end space removal only
	}

}