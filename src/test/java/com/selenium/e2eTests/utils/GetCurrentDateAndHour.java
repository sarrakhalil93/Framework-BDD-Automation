package com.selenium.e2eTests.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class GetCurrentDateAndHour {

	public String getActualDate() {
		SimpleDateFormat d = new SimpleDateFormat("dd/mmm/yyyy");
		Date currentDate_1 = new Date();
		String dateString = d.format(currentDate_1) ;
		return dateString;	
	}
	
	public String getActualHour() {
		SimpleDateFormat h = new SimpleDateFormat("hh:mm");
		Date currentTime_1 = new Date();
		String hourString = h.format(currentTime_1) ;
		return hourString;	
	}
	
	public String getActualDateHour() {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/mmm/yyyy '-' hh:mm");
		Date date = new Date(System.currentTimeMillis());
		return formatter.format(date);
	}
	
	
}
