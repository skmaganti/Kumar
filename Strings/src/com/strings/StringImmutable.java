package com.strings;

public class StringImmutable {

	public static void main(String[] args) {
		String s1 = new String("satish");
		String s2 = s1.toLowerCase(); //if there is no change in content during runtime then same reference is applied and existing object is resused
		System.out.println(s1==s2);
		String s3 = s2.toUpperCase();
		System.out.println(s1==s3);
		
		String s4 = "kumar";
		String s5 = s4.toString();
		String s6 = s4.toLowerCase();
		String s7 = s4.toUpperCase();
		System.out.println(s4==s5);
		System.out.println(s4==s6);
		System.out.println(s4==s7);
	}

}
