package Array;

import java.util.Scanner;

public class Array_Element_Addition_Using_Scanner 
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
			Add = Add + Numbers[i];
		}
		
		System.out.println("Addition Of Given Array Element Is -> " + Add);
	}
}
