package Multi_Class_Communication;

import java.util.Scanner;

public class User_Input 
{
	int No1, No2;
	public void User()
	{
		System.out.print("\n Enter First Number -> ");
		Scanner s1 = new Scanner(System.in);
		No1 = s1.nextInt();
		System.out.print("\n Enter Second Number -> ");
		Scanner s2 = new Scanner(System.in);
		No2 = s2.nextInt();
		Add();
	}
	
	public void Add()
	{
		System.out.print("\n Addition -> " + No1 + " + " + No2 + " = " + (No1+No2));
	}
}
