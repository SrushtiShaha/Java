package Digit_Program;

public class Addition_Of_Fibonnaci_And_Pell_Series 
{
	public static void main(String[] args) 
	{
		int No = 5, i = 0, Fibo1 = 0, Fibo2 = 1, Pell1 = 0, Pell2 = 1, Fibo = Fibo1, Pell = Pell1;
		System.out.print("\nFibonnaci \tPell \tAddition Of");
		System.out.print("\nSeries \t\tSeries \tBoth Series");
		System.out.print("\n" + Fibo1);
		System.out.print("\t\t" + Pell1);
		System.out.print("\t\t" + Pell1);
		System.out.print("\n" + Fibo2);
		System.out.print("\t\t" + Pell2);
		System.out.print("\t\t" + Pell2);
		while( i < No ) 
		{
			Fibo = Fibo1 + Fibo2;
			System.out.print("\n" + Fibo);
			Pell = (Pell2 * 2) + Pell1;
			System.out.print("\t\t" + Pell);
			System.out.print("\t\t" + (Fibo + Pell));
			Fibo1 = Fibo2;
			Fibo2 = Fibo;
			Pell1 = Pell2;
			Pell2 = Pell;
			i++;
		}
	}
}
