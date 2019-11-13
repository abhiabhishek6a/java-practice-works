package com.tb.work.statementswitchcase;
import java.util.Scanner;
public class SwitchCaseExample2
{
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter any case number: ");
		int n = scan.nextInt();
				
		switch(n)
		{
			case 1:
			System.out.println("Case 1");
			break;
			
			case 2:
			System.out.println("Case 2");
			break;
			
			case 3:
			System.out.println("Case 3");
			break;
			
			case 4:
			System.out.println("Case 4");
			break;
			
			default:
			System.out.println("Invalid Case Input");
		}
	}
}
