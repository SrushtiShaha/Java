package Exception_Handling.Program01.Runtime_Exception;

import java.util.Scanner;

public class ArithmaticException_01 
{
	public static void main(String[] args) 
	{
		int No1 = 0, No2 = 0;
		
		Scanner Obj = new Scanner(System.in);
		
		System.out.println("Program Start.");
		
		System.out.println("Enter Two Numbers -> ");
		No1 = Obj.nextInt();
		No2 = Obj.nextInt();
		
		try
		{
			int Ans = No1 / No2;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Can't Divide By 0.");
		}

		System.out.println("Program End.");
	}
}
