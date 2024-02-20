package Calculator;

import java.util.Scanner;

public class Calculator01
{
		int No, Ans = 0;
		public static void main(String[] args) 
		{
			Calculator01 Obj = new Calculator01();
			Obj.Addition();
		}
		
		public void Addition()
		{
			Scanner s = new Scanner(System.in);
			
			for(int i = 1; i <= 5; i++)
			{
				System.out.print("\n Enter " + i + " Number -> ");
				No = s.nextInt();
				Ans = Ans + No;
			}
			
			System.out.print("\n Addition -> " + Ans);
		}
}
