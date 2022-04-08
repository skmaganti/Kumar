package com.calendardate;

import java.time.LocalDateTime;
import java.time.Month;

public class LocalDateTimeOfClass {

	public static void main(String[] args) {
		LocalDateTime dt = LocalDateTime.of(1995, Month.MAY, 28, 07,04,34,34);
		System.out.println(dt);
		System.out.println(dt.plusDays(-6));
		System.out.println(dt.minusDays(6));
	}

}


//LocalDateTime dt = LocalDateTime.of(yy,mm,dd,h,m,s,n); -- This method can help print in year, month, day, hour, minute, seconds, nano seconds