package String;

public class Count_I_Or_i_In_String 
{
	public void Find_Char()
	{
		String Letter = "India";
		int Cnt = 0;
		
		System.out.println("Given String -> " + Letter);
		
		for( int i = 0; i < Letter.length(); i++ )
		{
			if( Letter.charAt(i) == 'I' || Letter.charAt(i) == 'i' )
			{
				Cnt++;
			}
		}
		
		System.out.println("Character 'I' And 'i' In Given String -> " + Cnt);
	}
	
	public static void main(String[] args) 
	{
		Count_I_Or_i_In_String Obj = new Count_I_Or_i_In_String();
		Obj.Find_Char();
	}
}
