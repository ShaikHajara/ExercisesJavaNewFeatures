package com.dateandtimeapi;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

public class Dateandtime {

	public static void main(String[]args){

		//Local date is immutable class which inherits object class and implement ChronoLocalDate interface
		LocalDate date=LocalDate.now();
		LocalDate Yesterday=date.minusDays(1);
		LocalDate Tmrw=Yesterday.plusDays(2);
		System.out.println(date);
		System.out.println(Yesterday);
		System.out.println(Tmrw);


	   System.out.println(date.isLeapYear());
	   LocalDate date1=LocalDate.of(2016, 9, 23);
	   LocalDateTime datetime=date1.atTime(1,50,9);
	   System.out.println(date1.isLeapYear());
	   System.out.println(datetime);


	   //Local time is immutable class which inherits object class and implement comparable interface
	   LocalTime time=LocalTime.now();
	   System.out.println(time);

	   ZoneId zone=ZoneId.of("Asia/Kolkata");

	   LocalTime time1 = LocalTime.now(zone);
	    System.out.println("India Time Zone: "+time1);

	    //LocalDateTime class is an immutable date-time object that represents a date-time, with the default format as yyyy-MM-dd-HH-mm-ss.zzz. It inherits object class and implements the ChronoLocalDateTime interface

	    LocalDateTime now=LocalDateTime.now();
	    System.out.println("Before formatting" + now);

	    DateTimeFormatter format=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
	    String Afterformat=now.format(format);
	    System.out.println("After formatting" + Afterformat);


	    LocalDateTime a = LocalDateTime.of(2017, 2, 13, 15, 56);
	    System.out.println(a.get(ChronoField.DAY_OF_WEEK));
	    System.out.println(a.get(ChronoField.DAY_OF_YEAR));
	    System.out.println(a.get(ChronoField.DAY_OF_MONTH));
	    System.out.println(a.get(ChronoField.HOUR_OF_DAY));
	    System.out.println(a.get(ChronoField.MINUTE_OF_DAY));

	    Clock c = Clock.systemDefaultZone();
	    System.out.println(c.getZone());

	}

}
