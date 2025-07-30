package Exception_Handling.Try_With_Multiple_Catch;

public class NullPointerException_01 
{
	public static void main(String[] args) 
	{
		try
		{
			int a =  20, b = 0;
			int c = a / b;
			String s = null;
			System.out.println(s.length());
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmatic Exception");
		}
		catch(NullPointerException e)
		{
			System.out.println("NullPointerException");
		}
		catch(RuntimeException e)
		{
			System.out.println("NullPointerException");
		}
		catch(Exception e)
		{
			System.out.println("NullPointerException");
		}
		catch(Throwable e)
		{
			System.out.println("NullPointerException");
		}

		System.out.println("Program End.");
	}
}
