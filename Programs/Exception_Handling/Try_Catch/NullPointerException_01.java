package Exception_Handling.Try_Catch;

public class NullPointerException_01 
{
	public static void main(String[] args) 
	{
		System.out.println("Program Start.");
		try
		{
			String s = null;
			System.out.println(s.charAt(2));
		}
		catch(NullPointerException e)
		{
			//e.printStackTrace();
			//System.out.println(e);
			System.out.println("String Is Null.");
		}
		System.out.println("Program End.");
	}
}
