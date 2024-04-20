package Array;

public class Addition_Of_Even_Odd_Numbers 
{
	public static void main(String[] args) 
	{
		int Number[] = { 6, 9, 4, 7, 3, 2 };
		int Even = 0, Odd = 0;
		
		for( int i = 0; i < Number.length; i++ )
		{
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
