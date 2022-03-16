package com.calendardate;

import java.time.LocalDate;
import java.time.Period;

public class LocalDateTimeClass {

	public static void main(String[] args) {
		LocalDate date1 = LocalDate.of(2022, 02, 03);
		Period period1 = Period.ofMonths(1);
		System.out.println(date1);
		date1.plus(period1);
		System.out.println(date1);
		LocalDate date2 = date1.plus(period1);
		System.out.println(date2);
	}

}
