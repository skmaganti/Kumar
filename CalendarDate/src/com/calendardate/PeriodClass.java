package com.calendardate;

import java.time.LocalDate;
import java.time.Period;

public class PeriodClass {

	public static void main(String[] args) {
		LocalDate date = LocalDate.of(1984,10,22);
		LocalDate today = LocalDate.now();
		Period p = Period.between(date, today);
		System.out.printf("Current Age is %d years %d months %d days",p.getYears(),p.getMonths(),p.getDays());
		LocalDate finalDate = LocalDate.of(1984+90, 03, 15);
		Period p1 = Period.between(date, finalDate);
		int d = p1.getYears();
		System.out.printf("\nfinal years are %d",d);
		
		
	}

}
