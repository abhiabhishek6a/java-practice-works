package com.tb.raisepower;

import java.util.Scanner;

public class Power
{
	public static void main(String[] args)
	{
		long r = 1;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter any number:");
		long n = scan.nextLong();
		
		System.out.println("Enter desired raise number:");
		long	 p = scan.nextLong();
		
		if(n>=0&&p==0)
		{
			r = 1;
		}
		else if(n==0&&p>=1)
		{
			r = 0;
		}
		else
		{
			for(long i = 1; i<=p; i++)
			{
				r = r*n;
			}
		}
		System.out.println(n+"^"+p+ "="+r);
	}
}
