package com.tb.utils;
import java.util.*;

public class ReadUtils
{
	public static int readInt(String userMsg, String wrnMsg)
	{
		int result = 0;
		try
		{
			System.out.println(userMsg);
			result = new Scanner(System.in).nextInt();
			
		}catch(Exception e) {
			System.out.println(wrnMsg + "Detailed" + e);
			readInt(userMsg, wrnMsg);
		}
		return result;
	}
}