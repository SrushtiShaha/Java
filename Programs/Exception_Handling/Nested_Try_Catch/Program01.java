package Exception_Handling.Nested_Try_Catch;

public class Program01 
{
	public static void main(String[] args) 
	{
		System.out.println("Program Start");
		try 
		{
			try
			{
				int a = 10, b = 0;
				int c = a / b;
			}
			catch(ArithmeticException e)
			{
				System.out.println("Can't Divide By Zero.");
			}
			String s = null;
			s.length();
		}
		catch(NullPointerException e)
		{
			System.out.println("String Is Null.");
		}

		System.out.println("Program End");
	}
}
