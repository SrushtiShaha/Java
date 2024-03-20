package Pattern_Printing;

public class Two_Triangles 
{
	public static void main(String[] args) 
	{
		int No = 9;
		
		for(int r = 1; r <= No; r++)
		{
			for(int c = 1; c <= No; c++)
			{
				if( r == 1 || r == c || r+c == (No+1) || r == No )
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
