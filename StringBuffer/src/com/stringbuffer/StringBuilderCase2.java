package com.stringbuffer;

public class StringBuilderCase2 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("satish");
		String str = sb.toString();
		String str1 = str;
		System.out.println(str == str1);

	}
}
