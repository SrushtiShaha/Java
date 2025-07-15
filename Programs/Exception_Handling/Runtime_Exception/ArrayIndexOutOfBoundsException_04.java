package Exception_Handling.Program01.Runtime_Exception;

public class ArrayIndexOutOfBoundsException_04 
{
	public static void main(String[] args) 
	{
		try
		{
			int a[] = { 1, 3, 5, 7 };
			System.out.println(a[6]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Given Index Not Exits.");
		}
	}
}
