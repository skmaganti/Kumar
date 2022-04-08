package com.calendardate;

import java.time.Year;
import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter year value");
		int n = sc.nextInt();
		Year y = Year.of(n);
		sc.close();
		if(y.isLeap()) {
			System.out.printf("%d year is leap year", n);
		}
		else
			System.out.printf("%d year is not leap year", n);
	}
	

}
