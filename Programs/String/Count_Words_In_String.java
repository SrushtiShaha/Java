package String;

public class Count_Words_In_String 
{
	public void Cound_Word()
	{
		String Statement = " My   Name   Is    The  Srushti Sudhir       Shaha. ";
		int Cnt = 0, i = 0;
		
		System.out.println("Given String -> " + Statement);
		
		i = 0;
		
		while( i < Statement.length() )
		{
			if( Statement.charAt(i) != ' ' )
			{
				Cnt++;
				
				while( Statement.charAt(i) != ' ' )
				{
					i++;
				}
			}
			else
			{
				i++;
			}
		}
		
		System.out.println("Total Words -> " + Cnt);
	}
	
	public static void main(String[] args) 
	{
		Count_Words_In_String Obj = new Count_Words_In_String();
		Obj.Cound_Word();
	}
}
