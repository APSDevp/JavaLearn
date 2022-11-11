package DateTimeAPI;

import java.time.*;

public class DateTime2JODA {

	public static void main(String[] args) {
		
		//latest APIs to use the Date and Time
		//Efficient
		
		LocalDate date = LocalDate.now();

		System.out.println(date);
		
		LocalTime time = LocalTime.now();
		
		System.out.println(time);
		
		System.out.println(date.getDayOfMonth());
		System.out.println(date.getYear());
		System.out.println(date.getDayOfWeek()); 
		System.out.println(date.getMonthValue());
		
		System.out.println(LocalDateTime.now()); //T is sepration between Date and Time
		
		//System.out.println(LocalDateTime.now().toString()); //To Avoid T in the codes
		
		LocalDateTime ob = LocalDateTime.of(1995,4,16,12,45);//yy,mm,dd,hh,mm
		
		System.out.println(ob);
		
		System.out.println(LocalDateTime.now().plusMonths(4)); //adding the months
		
		System.out.println(ob.plusYears(0));
		
		System.out.println(LocalDateTime.of(1995,Month.APRIL,16,12,45));
		
		//ZONEID
		
		ZoneId zone = ZoneId.systemDefault();
		
		System.out.println(zone);
		
		ZonedDateTime zt = ZonedDateTime.now(zone);
		
		System.out.println(zt);
		
		ZoneId za = ZoneId.of("America/Los_Angeles");
		
		ZonedDateTime zt1 = ZonedDateTime.now(za);
		
		System.out.println(za);
		System.out.println(zt1);
		
		//BirthDate Calculation
		
		LocalDate today = LocalDate.now();
		LocalDate birthday = LocalDate.of(1995,04,16);
		
		Period p = Period.between(birthday, today);
		
		System.out.println("The age is "+p);
		
		System.out.printf("The age is %d years %d months %d days",p.getYears(),p.getMonths(),p.getDays());
		
		
		//Strings[] args -- in p.sv.m -- cmd line values stored here
		
		//Integer data=Integer.parseInt(args[0]); //to get input from cmd line
		
		//Year year = Year.of(data);
		Year year = Year.of(2020);
		
		if(year.isLeap()) {
			
			System.out.println();
			System.out.println("it is leap year");
			
		}else {
			System.out.println("Not a leap year");
		}
		
	
	}

}
