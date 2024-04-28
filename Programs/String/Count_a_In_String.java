package String;

public class Count_a_In_String 
{
	public void Find_Char()
	{
		String Letter = "Shaha";
		int Cnt = 0;
		
		System.out.println("Given String -> " + Letter);
		
		for( int i = 0; i < Letter.length(); i++ )
		{
			if( Letter.charAt(i) == 'a' )
			{
				Cnt++;
			}
		}
		
		System.out.println("Character 'a' In Given String -> " + Cnt);
	}
	
	public static void main(String[] args) 
	{
		Count_a_In_String Obj = new Count_a_In_String();
		Obj.Find_Char();
	}
}
