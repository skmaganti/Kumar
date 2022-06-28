package com.calendardate;

import java.time.LocalDate;

import javax.swing.text.DateFormatter;

public class GetDateValues {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println("System Format "+date);
		int dayValue = date.getDayOfMonth();
		int monthValue = date.getMonthValue();
		int yearValue = date.getYear();
		System.out.printf("My own format %d-%d-%d",dayValue,monthValue,yearValue);
	}

}
