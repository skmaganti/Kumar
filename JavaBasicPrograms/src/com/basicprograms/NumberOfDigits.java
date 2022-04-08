package com.basicprograms;

import java.util.Scanner;

public class NumberOfDigits {

	public static void main(String[] args) {
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		while(num!=0) {
			num = num/10;
			count++;
		}
		System.out.println("Number of digits "+count);
	}

}
