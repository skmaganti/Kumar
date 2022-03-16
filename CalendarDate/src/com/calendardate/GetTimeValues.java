package com.calendardate;

import java.time.LocalTime;

public class GetTimeValues {

	public static void main(String[] args) {
		LocalTime time = LocalTime.now();
		System.out.println(time);
		int getHour = time.getHour();
		int getMinute = time.getMinute();
		int getSecond = time.getSecond();
		int getNanoSecond = time.getNano();
		System.out.printf("%d-%d-%d-%d",getHour,getMinute,getSecond,getNanoSecond);
	}

}
