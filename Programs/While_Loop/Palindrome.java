package com.sgm.task.While_Loop;

public class Palindrome 
{
	public static void main(String[] args) 
	{
		int No = 19091, Rem = 0, Rev = 0, Temp = 0;
		Temp = No;
		while( Temp > 0 ) 
		{
			Rem = Temp % 10;
			Rev = Rev * 10 + Rem;
			Temp = Temp / 10;
		}
		if( No == Rev ) 
		{
			System.out.println("Given Number " + No + " Is Palindrome.");
		}
		else 
		{
			System.out.println("Given Number " + No + " Is Not Palindrome.");
		}
	}
}
