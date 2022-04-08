package com.jeanne.decisionmaking;

public class DayOfWeek {
	public static void main(String[] args) {
		int dayOfWeek = 5;
		switch (dayOfWeek) {
		case 2:
			System.out.println("Monday");
			break;
		default:
			System.out.println("Weekday");
		case 6:
			System.out.println("Saturday");
			break;		
		case 1:
			System.out.println("Sunday");
		case 3:
			System.out.println("Tuesday");
			break;
		}
	}
}
