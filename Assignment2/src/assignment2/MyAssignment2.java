package assignment2;

import java.util.Calendar;
import java.time.LocalDate;
import java.util.Scanner;
import java.time.*;



public class MyAssignment2 {

	public static void main(String[] args) {

		// Initialization of variables for days, months, and years for first and second dates
		int day1 = 0;
		int month1 = 0;
		int year1 = 0;

		int day2 = 0;
		int month2 = 0;
		int year2 = 0;

		// Exception handling using try catch block
		try {						

			System.out.println("Enter Date 1 in format yyyy/mm/dd"); 	//User instruction that will print out

			Scanner s = new Scanner(System.in).useDelimiter("[\\/\\s*]"); //Input for Date 1 use delimiter /

			//Variables for the first date input
			year1 = s.nextInt();
			month1 = s.nextInt();
			day1 = s.nextInt();
			
			
			System.out.println("Date1 " + year1 + "/" + month1 + "/" + day1);	//Print out

			System.out.println("Enter Date2 in format yyyy/mm/dd");	//Print out

			s = new Scanner (System.in).useDelimiter("[\\/\\s*]");  //Input for Date2 use delimiter /

			//Variables for the second date input
			year2 = s.nextInt();
			month2 = s.nextInt();
			day2 = s.nextInt();

			System.out.println("Date2 " + year2 + "/" + month2 + "/" + day2);	//Print out

		}
		catch (Exception e) {

			System.out.println("Error: Invalid Date");	//Print out in case of exception

		}

		// Date variables of type LocalDate set using LocalDate.of() function/method
		LocalDate dt1 = LocalDate.of(year1, month1, day1);
		LocalDate dt2 = LocalDate.of(year2, month2, day2);
		
		// Duration between dates set in p using Period.between() function/method
		Period p = Period.between(dt1, dt2);

		// Variables of type long set with the number of days, months, and years from the difference in dates
		long days = p.getDays();
		long months = p.getMonths();
		long years = p.getYears();
		
		// If statements to check for negative durations
		if(p.getDays() < 0)
			days = days * (-1);
		if(p.getMonths() < 0)
			months = months * (-1);
		if(p.getYears() < 0)
			years = years * (-1);
		
		//Print out
		System.out.println(years + " years ");
		System.out.println(months + " months");
		System.out.println(days + " days");
		
				
	}

}




