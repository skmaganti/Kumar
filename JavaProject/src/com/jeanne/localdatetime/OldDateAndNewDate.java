package com.jeanne.localdatetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class OldDateAndNewDate {

	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d);
		LocalDate date = LocalDate.now();
		System.out.println(date);
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);
		Calendar c = Calendar.getInstance();
		c.set(2015,Calendar.JANUARY,1);
		Date jan = c.getTime();
		System.out.println(jan);
	}

}

//date and time classes are immutable