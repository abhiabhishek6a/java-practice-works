package com.tb.work;
import java.util.Scanner;
public class StatementSwitchCase
{
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter day");
		int day = scan.nextInt();
		
		String dayString;
		
		switch(day)
		{
			case 1: dayString = "Monday";
			break;
			
			case 2: dayString = "Tuesday";
			break;
			
			case 3: dayString = "Wednesday";
			break;
			
			case 4: dayString = "Thursday";
			break;
			
			case 5: dayString = "Friday";
			break;
			
			case 6: dayString = "Saturday";
			break;
			
			case 7: dayString = "Sunday";
			break;
			
			default: dayString = "Invalid Day";
			break;
		}
		System.out.println(dayString);
	}
}
