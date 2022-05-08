package com.jeanne.localdatetime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ParsingDateAndTime {

	public static void main(String[] args) {
		DateTimeFormatter f = DateTimeFormatter.ofPattern("MM dd yyyy");
		LocalDate date = LocalDate.parse("01 02 2015",f);
		LocalTime time = LocalTime.parse("11:22");
		System.out.println(date);
		System.out.println(time);
	}

}
