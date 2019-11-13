package com.tb.work.statementswitchcase;
import java.util.Scanner;
public class SwitchMarksComplement
{
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Grade: ");
		char grade = scan.next().charAt(0);
		
		switch (grade)
		{
		case 'A':
			System.out.println("Excellent");
			break;
			
		case 'B':
		case 'C':
			System.out.println("Very Good");
			break;
			
		case 'D':
			System.out.println("Better");
			break;
			
		default:
			System.out.println("Invalid Input");
			break;
		}
		System.out.println("Grade is " +grade);
	}
}
