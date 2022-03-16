package com.stringbuffer;

public class StringBufferCapacity {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());
		sb.append("abcdefghijklmnop"); //upto 16 characters are added so output will be 16
		System.out.println(sb.capacity());
		sb.append("q");
		System.out.println(sb.capacity()); //(16+1)*2 = 34 is the new capacity
	}

}
