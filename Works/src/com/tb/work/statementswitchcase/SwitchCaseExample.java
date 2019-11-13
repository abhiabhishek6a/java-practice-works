package com.tb.work.statementswitchcase;
import java.util.Scanner;
public class SwitchCaseExample
{
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter any number:");
		int n = scan.nextInt();
		
		switch(n+2)
		{
			case 1:
			System.out.println("Case 1: value is " +n);
			break;
			
			case 2:
			System.out.println("Case 2: value is " +n);
			break;
			
			case 3:
			System.out.println("Case 3: value is " +n);
			break;
			
			case 4:
			System.out.println("Case 4: value is " +n);
			break;
			
			default: 
			System.out.println("Default value is " +n);
			break;
		}
	}
}
