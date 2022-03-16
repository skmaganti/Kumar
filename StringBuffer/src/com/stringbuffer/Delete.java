package com.stringbuffer;

public class Delete {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("kumar");
		sb.delete(0, 2); //begin to end - 1
		System.out.println(sb);
		sb.deleteCharAt(0);
		System.out.println(sb);
	}

}
