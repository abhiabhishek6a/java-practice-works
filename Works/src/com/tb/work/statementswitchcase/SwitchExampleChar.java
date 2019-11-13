package com.tb.work.statementswitchcase;
import java.util.Scanner;
public class SwitchExampleChar
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter any character for case: ");
		char ch = scan.next().charAt(0);
		
		switch(ch)
		{
		case 'a':
			System.out.println("Case 1 at alphabet a");
			break;
			
		case 'b':
			System.out.println("Case 2 at alphabet b");
			break;
			
		case 'c':
			System.out.println("Case 3 at alphabet c");
			break;
			
		case 'd':
			System.out.println("Case 4 at alphabet d");
			break;
			
			default:
				System.out.println("Invalid Case Input");
				break;
		}
	}
}
