package com.exceptionhandling;

import java.util.Scanner;

public class MarriageRegistrationException {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Age");
		int age = s.nextInt();
		System.out.println("Age is "+age);
		s.close();		
		
		if(age>60) {
			throw new OldClass("Not eligible for older age");
		}
		else if(age<18) {
			throw new YoungClass("Not eligible for younger age");
		}
		else
		{
			System.out.println("Thanks for Registration");
		}
	}

}
