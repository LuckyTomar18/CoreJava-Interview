package com.rays.javabasic;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarModif {

	public static void main(String[] args) throws Exception {

		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		
		Calendar c = Calendar.getInstance();
		
		Date date = sdf.parse("01-01-2025");
		
		c.setTime(date);
		
		for (int i = 0; i <= 12; i++) {
			System.out.println(sdf.format(c.getTime()));
			
			c.add(Calendar.DATE, 30);
		}
		

	}

}
