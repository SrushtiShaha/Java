package Exception_Handling.Program01.Runtime_Exception;

public class NullPointerException_02 
{
	public static void main(String[] args) 
	{
		System.out.println("Program End.");
		try
		{
			String s = null;
			s.length();
		}
		catch(NullPointerException e)
		{
			System.out.println("Can't Find Length Of Null String.");
		}
		System.out.println("Program End.");
	}
}
