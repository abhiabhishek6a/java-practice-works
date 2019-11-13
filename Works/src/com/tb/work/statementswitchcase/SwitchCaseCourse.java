package com.tb.work.statementswitchcase;
import java.util.Scanner;
public class SwitchCaseCourse
{
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Course Branch: ");
		String branch = scan.nextLine();
		
		System.out.println("Enter year: ");
		int year = scan.nextInt();
		
		switch (year)
		{
		case 1:
			System.out.println("Computer");
			break;
			
		case 2:
			System.out.println("Software Program");
			break;
			
		case 3:
			
			switch (branch)
			{
			case "CSE":
				System.out.println("Computer Science Engineering");
				
			case "CSIT":
				System.out.println("CS Information Technology");
				break;
				
			case "Science":
				System.out.println("Physics, Chemistry");
				break;
				
			default:
				System.out.println("Invalid course");
				break;
			}
			default:
				System.out.println("Invalid Course Year");
				break;
		}
		
	}
}
