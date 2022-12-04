package fajavaprogram;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class Z_DateTime {

	public static void main(String[] args) {
		
		// Before Java 8
		String date=new SimpleDateFormat("yyyy_MM_dd_hh_mm_ss").format(Calendar.getInstance().getTime());
		System.out.println(date);
		
		Date date1=new Date(System.currentTimeMillis());
		System.out.println(date1);
		
		// After JAva 8
		LocalDate localdate=LocalDate.now();
		System.out.println(localdate);
		
		LocalDateTime ldt=LocalDateTime.now();
		System.out.println(ldt);	
	}
}
