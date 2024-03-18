package Pattern_Printing;

public class Triangle02 
{
	public static void main(String[] args) 
	{
		int No = 5;
		
		for(int r = 1; r <= No; r++)
		{
			for(int c = 1; c <= No; c++)
			{
				if( c == 1 || r >= c || r == No )
				{
					System.out.print(" * ");
				}
				else
				{
					System.out.print("   ");
				}
			}
			System.out.println();
		}
	}
}
