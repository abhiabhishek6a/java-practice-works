package com.tb.work.array;

public class ArrayWork
{
	public static void main(String[]args)
	{
		
		
		int array[] = new int[10];
		System.out.println("Enter the number of arrays: ");
		for (int i = 0; i<10; i++)
		{
			array[i] =i;
		}
		for (int i = 0; i<10; i++)
		{
			System.out.println("array[" +i+"] = " +array[i]);
		}
	}
}