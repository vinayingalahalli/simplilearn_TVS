package eg1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatDateDemo {

	public static void main(String[] args) {
	
		Date d=new Date();
		System.out.println(d);
		
		/*
		 *  dd - date in 2 digits  eg - 21, 02 
		 *  d  - eg : 23, 2
		 *  MM - month in 2 digits eg 12, 01, 03
		 *  M - eg : 12,1,3
		 *  MMM - shortname of the month (Oct,Sep,Jan,May)
		 *  MMMM - fullname of the month (January, October)
		 *  yyyy - 4 digits of year 
		 *  yy - last 2 digits of the year
		 *  hh - 12 hour format
		 *  HH - 24 hour format
		 *  mm - minutes
		 *  ss - seconds
		 *  a - AM/PM
		 *  z/Z - timezone
		 *  EEE - day name in short(Fri,Mon)
		 *  EEEE - fullname of the day(friday,Monday)
		 *  
		 */
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MMMM-yyyy EEEE hh:mm:ss a HH z Z");
		System.out.println(sdf.format(d)); //format takes dateobj and returns String as a formatted date
	}

}
