public class Grade_System
{
	public static void main(String args[])
	{
		int Marks = 67;
		
		if( Marks >= 90)
		{
			System.out.println("\n A+");
		}
		else if( Marks >= 70 )
		{
			System.out.println("\n A");		
		}
		else if( Marks >= 60 )
		{
			System.out.println("\n B");
		}
		else if( Marks >= 50 )
		{
			System.out.println("\n C");
		}
		else if( Marks >= 35 )
		{
			System.out.println("\n D");
		}
		else	
		{
			System.out.println("\n Fail");
		}
	}
}