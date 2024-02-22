package Calculator;

import java.util.Scanner;

public class Calculator03 
{
	public static void main(String[] args) 
	{
		int No = 0, Ans = 0;
		Scanner s = new Scanner(System.in);
		
		for(int i = 1; true; i++)
		{
			System.out.print("\n Enter Number -> ");
			No = s.nextInt();
			if(i == 1)
			{
				Ans = No * 2;
			}
			
			if(No == 0)
			{
				break;
			}
			else
			{
				Ans = Ans - No;
			}
		}
		
		System.out.print("\n Substraction -> " + Ans);
	}
}
