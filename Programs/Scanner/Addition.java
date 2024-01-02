package Scanner_Program;

import java.util.Scanner;

public class Addition 
{
	public void Add()
	{
		int No1, No2;
		Scanner s = new Scanner(System.in);
		System.out.print("1st Number = ");
		No1 = s.nextInt();
		System.out.print("2nd Number = ");
		No2 = s.nextInt();
		
		int Ans = No1 + No2;
		
		System.out.println("Addition -> " + No1 + " + " + No2 + " = " + Ans);
	}
	public static void main(String[] args) 
	{
		Addition Obj = new Addition();
		Obj.Add();
	}
}
