package Exception_Handling.Custom_Exception.Program01;

public class Class_Main 
{
	public static void main(String[] args) 
	{
		AgeValidation a = new AgeValidation();
		try
		{
			a.ageValidation();
		}
		catch(InvalidAgeException e)
		{
			System.out.println(e);	
		}
	}
}
