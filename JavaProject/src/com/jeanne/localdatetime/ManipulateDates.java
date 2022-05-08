package com.jeanne.localdatetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class ManipulateDates {

	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2014, Month.JANUARY, 20);
		System.out.println(date);
		date = date.plusDays(2);
		System.out.println(date);
		date = date.plusWeeks(1);
		System.out.println(date);
		date = date.plusMonths(1);
		System.out.println(date);
		date = date.plusYears(3);
		System.out.println(date);
		
		LocalDate dt = LocalDate.of(2022, Month.MAY, 3);
		LocalTime t = LocalTime.of(2, 22);
		LocalDateTime dateTime = LocalDateTime.of(dt, t);
		System.out.println(dateTime);
		dateTime = dateTime.minusDays(1);
		dateTime = dateTime.minusHours(2);
		System.out.println(dateTime);
		dateTime.minusDays(3).minusHours(3).minusSeconds(40);
		System.out.println(dateTime);
		
	}

}
