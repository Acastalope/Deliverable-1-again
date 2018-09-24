package assignment2;

import java.util.Calendar;
import java.util.Date;
import java.time.LocalDate;
import java.util.Scanner;


public class MyAssignment2 {

	public static void main(String[] args) {
		// First statement
		
		Calendar cal = Calendar.getInstance();
		Calendar cal1 = Calendar.getInstance();
		
		int day1 = 0;
		int month1 = 0;
		int year1 = 0;
		
		int day2 = 0;
		int month2 = 0;
		int year2 = 0;
					
		try {
			
		System.out.println("Enter Date 1 ");
		
		Scanner s = new Scanner(System.in.useDelimiter("[/\s]"); //Input for Date 1
		
		day1 = a.nextIn();
		month1 = s.nextInt();
		year1 = s.nextInt();
		
		System.out.println("Date1 " + day1 + "/" + month1 + "/" + year1");
				
		System.out.println("Enter Date2");
		
		s = new Scanner (System.in).useDelimiter("[/\s]");  //Input for Date2
		
		day2 = s.nextInt();
		month2 = s.nextInt();
		year2 = a.nextInt();
		
		System.out.println("Date2 " + day2 + "/" + month2 + "/" + year2);
		
		} catch (Exception e)
		
		System.out.println("Error: Invalid Date");
		
	}
	 
		cal.set(year1), month1-1, day1, 12, 0, 0);
		cal1.set(year2), month2-1, day2, 12, 0, 0);
		
		long Days= (call.getTime().getTime()-
		cal.getTime().getTime())/(24*3600*1000);
				
		System.out.println("Number of Days between" + new
		SimpleDateFormat("dd/MM/yyyy").format(cal.getTime().getTime()) + " and " + new
		
		SimpleDateFormat("dd/MM/yyyy").format(call.getTime().getTime()) + " = " + Days);
		
		Days+days(cal,call);
		System.out.println ("Days calculate by user defined function days () : " + Days");"
				
		}
 		public static long days(Calendar date1, Calendar date2) {
 			
 			Calendar temp; 
 			boolean negative=false; 
 			long days = 0;
 			
 		if(date1.after(date2))  //Swap date if date1 is greater than date 2
 		{
 			
 		negative=true;
 		temp=date1;
 		date1=date2;
 		date2=temp;
 		
 		while (date1.before(date2))
 			
 			date1.add(Calendar.DAY_OF_MONTH, 1);
 			days++;
 			
 		}
 		
 		if(negative)
 		{
 			return -days;
 		}
 		else
 			return days;
 		}
 		
 		}
		
		
	

		