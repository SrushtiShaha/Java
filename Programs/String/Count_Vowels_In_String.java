package String;

public class Count_Vowels_In_String 
{
	public void Count_Vowel()
	{
		String Vowel = "aeiouAEIOU";
		int Cnt = 0;
		
		System.out.println("Given String -> " + Vowel);
		
		for( int i = 0; i < Vowel.length(); i++ )
		{
			if( Vowel.charAt(i) == 'a' || Vowel.charAt(i) == 'A' ||Vowel.charAt(i) == 'e' ||Vowel.charAt(i) == 'E' ||Vowel.charAt(i) == 'i' ||Vowel.charAt(i) == 'I' ||Vowel.charAt(i) == 'o' ||Vowel.charAt(i) == 'O' ||Vowel.charAt(i) == 'u' || Vowel.charAt(i) == 'U' )
			{
				Cnt++;
			}
		}
		
		System.out.println("Vowel In Given String -> " + Cnt);
	}
	
	public static void main(String[] args) 
	{
		Count_Vowels_In_String Obj = new Count_Vowels_In_String();
		Obj.Count_Vowel();
	}
}
