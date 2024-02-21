package Calculator;

import java.util.Scanner;

public class Calculator02 
{
	public static void main(String[] args) 
	{
		int No = 0, Ans = 0;
		Scanner s = new Scanner(System.in);
		
		while(true)
		{
			System.out.print("\n Enter Number -> ");
			No = s.nextInt();
			if(No == 0)
			{
				break;
			}
			else
			{
				Ans = Ans + No;
			}
		}
		
		System.out.print("\n Addition -> " + Ans);
	}
}
