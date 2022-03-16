package com.strings;

import java.util.Scanner;

public class StringTrim {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your city name");
		String name = s.nextLine().trim();
		if(name.equalsIgnoreCase("Hyderabad")) {
			System.out.println("you are local person");
		} else{
			System.out.println("you are not local person");
		}
		
	}

}
