package com.jeanne.localdatetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateTimeFormatterAnotherClass {

	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2022, Month.MAY, 3);
		LocalTime time = LocalTime.of(5, 50);
		LocalDateTime dateTime = LocalDateTime.of(date, time);
		DateTimeFormatter shortDateTime  = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		System.out.println(shortDateTime.format(dateTime));
		System.out.println(dateTime.format(shortDateTime));
	}

}
