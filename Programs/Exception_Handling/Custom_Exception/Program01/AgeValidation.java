package Exception_Handling.Custom_Exception.Program01;

public class AgeValidation 
{
	int Age = 17;
	public void ageValidation()
	{
		if(Age < 18)
		{
			throw new InvalidAgeException("Invalid Age");
		}
		else
		{
			System.out.println("Age Is Valid.");
		}
		System.out.println("Program End.");
	}
}
