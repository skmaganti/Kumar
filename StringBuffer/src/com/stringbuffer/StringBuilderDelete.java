package com.stringbuffer;

public class StringBuilderDelete {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("satish");
		System.out.println(sb.length());
		sb.delete(0, sb.length());
		System.out.println(sb.length());
	}

}
