package com.strings;

public class StringCase6 {

	public static void main(String[] args) {
		String s1 = new String("Satish");
		String s2 = new String("Satish");
		System.out.println(s1==s2); //false
		String s3 = "Satish";
		System.out.println(s1==s3); //false
		String s4 = "Satish";
		System.out.println(s3==s4);//true
		String s5 = "Sa"+"tish";
		System.out.println(s4==s5);//true
		String s6 = "sa";
		String s7 = s6 + "tish"; //s7 is created in heap area
		System.out.println(s4==s7); //this operation is performed at runtime as there is one variable
		final String s8 = "Sa"; //here final is used so s8 is constant
		String s9 = s8+"tish"; //if both constants are there then operaiton is performed at compile time
		System.out.println(s4==s9);
		
		
	}

}
