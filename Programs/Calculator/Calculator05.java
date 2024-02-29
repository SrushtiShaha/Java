package Calculator;

import java.util.Scanner;

public class Calculator05 
{
	public static void main(String[] args) 
	{
		int No = 0, Add = 0, Sub = 0;
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
				Add = Add + No;
			}
		}
		
		System.out.print("\n Addition -> " + Add + "\n");

		Sub = Add;
		
		for(int i = 1; true; i++)
		{
			System.out.print("\n Enter Number -> ");
			No = s.nextInt();
		
			if(No == 0)
			{
				break;
			}
			else
			{
				Sub = Sub - No;
			}
		}
		
		System.out.print("\n Substraction -> " + Sub);
	}
}
