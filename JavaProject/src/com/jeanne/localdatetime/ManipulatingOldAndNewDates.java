package com.jeanne.localdatetime;

import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;

public class ManipulatingOldAndNewDates {
	public Date addDay(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.DATE, 1);
		return cal.getTime();
	}
	
	public LocalDate addDays(LocalDate date) {
		return date.plusDays(1);
	}
	public static void main(String[] args) {
		
	}

}
