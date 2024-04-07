package Array;

import java.util.Scanner;

public class Print_Array_Element_Using_Loop 
{
	public static void main(String[] args) 
	{
		int Numbers[] = new int[4];
		int Add = 0;
		
		Scanner Obj = new Scanner(System.in);
		
		for( int i = 0; i < Numbers.length; i++ )
		{
			System.out.print("Enter " + i + " Element -> ");
			Numbers[i] = Obj.nextInt();
		}
	
		for( int i = 0; i < Numbers.length; i++ )
		{
			System.out.println(i + " Element Value -> " + Numbers[i]);
		}
	}
}
