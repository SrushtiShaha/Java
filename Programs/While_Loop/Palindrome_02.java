package com.sgm.task.While_Loop;

public class Palindrome_02 
{
	public static void main(String[] args) 
	{	
		for( int i = 1; i <= 1000; i++ )
		{
			int No = i, Rem = 0, Rev = 0, Temp = 0;
			Temp = No;
			while( Temp > 0 ) 
			{
				Rem = Temp % 10;
				Rev = Rev * 10 + Rem;
				Temp = Temp / 10;
			}
			if( No == Rev ) 
			{
				System.out.println(No);
			}
		}
	}
}
