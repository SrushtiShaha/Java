package Exception_Handling.Finally_Block;

public class Program_02 
{
	public static void main(String[] args) 
	{
		try
		{
			int a[] = { 1, 2, 3, 4 };
			System.out.println(a[6]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Arithmetic Exception.");
		}
		finally
		{
			System.out.println("This Is Finally Block.");
		}
		
		System.out.println("Program End");
	}
}
