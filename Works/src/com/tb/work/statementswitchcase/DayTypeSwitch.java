package com.tb.work.statementswitchcase;
import java.util.Scanner;
public class DayTypeSwitch
{
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Day");
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
		
		String dayType;
		
		switch(day)
		{
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				dayType = "Weakdays";
				break;
				
			case 6:
			case 7:
				dayType = "Weakends";
				break;
				
				default: dayType = "Invalid Day Type";
				break;
		}
		System.out.println(dayType);
	}
}
