package Exception_Handling.Throws_Keyword.Program01;

public class Main_Method 
{
	public static void main(String[] args)  
	{
		Basic_Throws_Use Obj = new Basic_Throws_Use();
		try
		{
			try
			{				
				try
				{
					Obj.Information();
				}
				catch(StringIndexOutOfBoundsException e)
				{
					System.out.println("StringIndexOutOfBoundsException \nGiven Index Not Exist");
				}

				Obj.Add();
			}
			catch(ArithmeticException e)
			{
				System.out.println("ArithmeticException \nCan't Divide By Zero");
			}
			
			Obj.Array();
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException \nGiven Index Not Exist");
		}
		
	}
}
