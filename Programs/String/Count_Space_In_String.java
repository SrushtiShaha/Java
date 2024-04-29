package String;

public class Count_Space_In_String 
{
	public void Count_Space()
	{
		String Space = " S R U S H T I   S H A H A ";
		int Cnt = 0;
		
		System.out.println("Given String -> " + Space);
		for( int i = 0; i < Space.length(); i++ )
		{
			if( Space.charAt(i) == ' ' )
			{
				Cnt++;
			}
		}
		
		System.out.println("Space In Given String -> " + Cnt);
	}
	
	public static void main(String[] args) 
	{
		Count_Space_In_String Obj = new Count_Space_In_String();
		Obj.Count_Space();
	}
}
