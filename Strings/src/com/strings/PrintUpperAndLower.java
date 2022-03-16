package com.strings;

import java.util.Scanner;

public class PrintUpperAndLower {

	public static void main(String[] args) {
		int count = 0;
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = scn.nextLine();
		System.out.println("Upper case letters");
		for (int i = 0; i<str.length();i++) {
			if(Character.isUpperCase(str.charAt(i))) {
				System.out.print(str.charAt(i)+",");
				count++;
			}
		}
		System.out.println("");
		System.out.println("Number of upper case letters "+count);
		System.out.println("");
		System.out.println("Lower case letters");
		count = 0;
		for(int i = 0; i<str.length();i++) {
			if(Character.isLowerCase(str.charAt(i))) {
				System.out.print(str.charAt(i)+",");
				count++;
		}
	}
		System.out.println("");
		System.out.println("Number of lower case letters "+count);
	}
}

