package com.calendardate;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneClass {

	public static void main(String[] args) {
		ZoneId zone = ZoneId.systemDefault();
		System.out.println(zone);
		
		ZoneId zi = ZoneId.of("America/Los_Angeles");
		ZonedDateTime zt = ZonedDateTime.now(zi);
		System.out.println("\n"+zt);
	}

}
