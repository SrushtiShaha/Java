package String;

public class Check_Palindrome 
{
	public void Palindrome()
	{
		String String1 = "madam";
		String String2 = "";
		int Length = String1.length();
		int i = 0;
		
		System.out.println("Given String -> " + String1);
		
		for( i = (Length-1); i >= 0; i-- )
		{
			String2 = String2 + String1.charAt(i);
		}
		System.out.println("Reverse String -> " + String2);

		
		for( i = (Length-1); i >= 0; i-- )
		{
			if( String1.charAt(i) == String2.charAt(i) )
			{
				continue;
			}
			else
			{
				break;
			}
		}
		
		if( i < 0 )
		{
			System.out.println("Given String Is Palindrome.");
		}
		else
		{
			System.out.println("Given String Is Not Palindrome.");
		}
	}
	
	public static void main(String[] args) 
	{
		Check_Palindrome Obj = new Check_Palindrome();
		Obj.Palindrome();
	}
}
