package com.jeanne.localdatetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateClass {

	public static void main(String[] args) {
		LocalDate date1 = LocalDate.of(2015, Month.JANUARY, 20);
		LocalDate date2 = LocalDate.of(2015,1,20);
		System.out.println(date1);
		System.out.println(date2);
		LocalTime time1 = LocalTime.of(6, 15);
		LocalTime time2 = LocalTime.of(6, 15, 30);
		LocalTime time3 = LocalTime.of(6, 15, 30, 200);
		System.out.println(time1+" "+time2+" "+time3);
		LocalDateTime dateTime1 = LocalDateTime.of(2020, Month.JANUARY, 20, 6, 15, 30);
		LocalDateTime dateTime2 = LocalDateTime.of(date1, time1);
		System.out.println(dateTime1);
		System.out.println(dateTime2);
		
//		LocalDate d = new Localdate();//constructor not allowed
//		LocalDate.of(2020, Month.JULY, 34);
		
		LocalDate date = LocalDate.of(2022, 01, 4);
		System.out.println(date.getDayOfWeek());
		System.out.println(date.getDayOfMonth());
		System.out.println(date.getDayOfYear());
		System.out.println(date.getMonthValue());
		System.out.println(date.getMonth());
		System.out.println(date.getYear());
	}

}
