package Exception_Handling.Custom_Exception.Program02;

public class CantRegisterException extends RuntimeException
{
	public CantRegisterException(String str)
	{
		super(str);
	}
}
