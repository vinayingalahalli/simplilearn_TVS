package eg1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ReadAndValidateDateDemo {

	public static void main(String[] args) {

		Date d = null;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter date in this format(dd.MM.yyyy)");
		String s = sc.nextLine();
		SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
		sdf.setLenient(false);//this sets sdf to strict and it will check the proper date values which is in Calendar
		try {
			d = sdf.parse(s);  //taking the string object and parsing it to dateobject
			System.out.println("Date which is read is "+d);
		} catch (ParseException e) {
			System.out.println("Date should and must be in dd.MM.yyyy format only and the valid one");
		}
	}

}
