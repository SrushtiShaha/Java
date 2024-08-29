package Multi_Class_Communication;

public class Palindrome_Armstrong 
{
	public void Armstrong()
	{
		int No = 153, Temp = No, Cnt = 0, Rem = 0, Ans = 0; 
		
		while( Temp > 0 ) 
		{
			Temp = Temp / 10;
			Cnt++;
		}
		
		Temp = No;
		while( Temp > 0 ) 
		{
			Rem = Temp % 10;
			int Count = Cnt;
			int Pow = 1;
			while( Count > 0 ) 
			{
				Pow = Pow * Rem;
				Count--;
			}
			
			Ans = Ans + Pow;
			
			Temp = Temp / 10;
		}
		
		if( No == Ans ) 
		{
			System.out.println("Given Number " + No + " Is Armstrong.");
		}
		else 
		{
			System.out.println("Given Number " + No + " Is Not Armstrong.");
		}
	}
	
	public void Palindrome()
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
