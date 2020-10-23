package eg1;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Java8DateTimeApiDemo {

	public static void main(String[] args) {
		
		LocalDate ld1=LocalDate.now();
		System.out.println(ld1);
		System.out.println(ld1.isLeapYear());
		ld1=ld1.plusYears(1);
		System.out.println(ld1);
		System.out.println(ld1.isLeapYear());
		ld1=ld1.minusYears(20);
		System.out.println(ld1);
		
		
		LocalDate dob=LocalDate.parse("12.11.2000", DateTimeFormatter.ofPattern("dd.MM.yyyy"));
		LocalDate today=LocalDate.now();
		System.out.println("dob : "+dob);
		System.out.println("today : "+today);
		
		Period p=Period.between(dob, today);
		System.out.println("You are "+p.getYears()+"year/s,"+p.getMonths()+"month/s and "+p.getDays()+"days old or young");
		
		System.out.println("No of days since your birth "+ChronoUnit.DAYS.between(dob, today));
		System.out.println("No of months since your birth "+ChronoUnit.MONTHS.between(dob, today));
		System.out.println("No of years since your birth "+ChronoUnit.YEARS.between(dob, today));
		System.out.println("No of weeks since your birth "+ChronoUnit.WEEKS.between(dob, today));
	}

}//LocalTime, LocalDateTime
