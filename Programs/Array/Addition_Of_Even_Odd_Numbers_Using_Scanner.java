package Array;

import java.util.Scanner;

public class Addition_Of_Even_Odd_Numbers_Using_Scanner 
{
	public static void main(String[] args) 
	{
		int Number[] = new int[6];
		int Even = 0, Odd = 0;
		
		Scanner Obj = new Scanner(System.in);
		
		for( int i = 0; i < Number.length; i++ )
		{
			System.out.print("Enter " + i + " Element -> ");
			Number[i] = Obj.nextInt();

			if( Number[i] % 2 == 0 )
			{
				Even = Even + Number[i];
			}
			else
			{
				Odd = Odd + Number[i];
			}
		}
		
		System.out.println("Even Numbers Addition -> " + Even);
		System.out.println("Odd Numbers Addition -> " + Odd);
	}
}
