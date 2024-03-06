package Digit_Program;

public class Pell_Series 
{
	public static void main(String[] args) 
	{
		int No = 10, i = 0, Dig1 = 0, Dig2 = 1, Ans = Dig1;
		System.out.print(Dig1 + "\n" + Dig2);
		while( i < No ) 
		{
			Ans = Dig2 * 2 + Dig1;
			System.out.print("\n" + Ans);
			Dig1 = Dig2;
			Dig2 = Ans;
			i++;
		}
	}
}
