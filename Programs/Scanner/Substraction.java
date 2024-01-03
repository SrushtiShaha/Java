package Scanner_Program;

import java.util.Scanner;

public class Substraction 
{
	public static void Sub()
	{
		int No1, No2;
		Scanner s = new Scanner(System.in);
		System.out.print("1st Number = ");
		No1 = s.nextInt();
		System.out.print("2nd Number = ");
		No2 = s.nextInt();
		
		int Ans = No1 - No2;
		
		System.out.println("Substraction -> " + No1 + " - " + No2 + " = " + Ans);
	}
	public static void main(String[] args) 
	{
		//Substraction Obj = new Substraction();
		//Obj.Sub();
		Sub();
	}
}
