package Exception_Handling.Program01.Runtime_Exception;

public class IndexOutOfBoundsException_03 
{
	public static void main(String[] args) 
	{
		try
		{
			String s = "Srushti";
			System.out.println(s.charAt(8));
		}
		catch(IndexOutOfBoundsException e)
		{
			System.out.println("Given Index Not Exits.");
		}
	}
}
