package com.jeanne.localdatetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class PatternFormat {

	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2022, Month.MAY, 03);
		LocalTime time = LocalTime.of(07, 19);
		LocalDateTime dateTime = LocalDateTime.of(date,time);
		DateTimeFormatter d = DateTimeFormatter.ofPattern("MMMM dd, yyyy, hh:mm");
		System.out.println(dateTime.format(d));
		
	}

}
