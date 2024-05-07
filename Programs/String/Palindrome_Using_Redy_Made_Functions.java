package String;

public class Palindrome_Using_Redy_Made_Functions 
{
	public void Check_Palindrome()
	{
		String String1 = "madam";
		String String2 = "";
		int i = 0;
		
		System.out.println("Given String -> " + String1);
		
		for( i = (String1.length()-1); i >= 0; i-- )
		{
			String2 = String2 + String1.charAt(i);
		} 
		
		System.out.println("Reverse String -> " + String2);
		
		if( String1.equals(String2) )
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
		Palindrome_Using_Redy_Made_Functions Obj = new Palindrome_Using_Redy_Made_Functions();
		Obj.Check_Palindrome();
	}
}
