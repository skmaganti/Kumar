package com.strings;

public class StringsEqualsIgnoreCase {

	public static void main(String[] args) {
		String s1 = "Java";
		String s2 = new String("java");
		if(s1.equalsIgnoreCase(s2)) {
			System.out.println("Both are equal");
		}
		else
		{
			System.out.println("Both are not equal");
		}
	}

}
