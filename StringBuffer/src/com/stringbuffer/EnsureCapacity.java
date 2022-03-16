package com.stringbuffer;

public class EnsureCapacity {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("kumar");
		sb.ensureCapacity(100);
		System.out.println(sb.capacity());
		sb.append("M");
		sb.trimToSize(); //This will trim to size of the characters
		System.out.println(sb);
		System.out.println(sb.capacity());
	}

}
