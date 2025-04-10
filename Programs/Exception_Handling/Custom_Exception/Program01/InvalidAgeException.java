package Exception_Handling.Custom_Exception.Program01;

public class InvalidAgeException extends RuntimeException
{
	public InvalidAgeException(String s)
	{
		super(s);
	}
}

