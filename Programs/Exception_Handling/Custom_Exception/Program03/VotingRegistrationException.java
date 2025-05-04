package Exception_Handling.Custom_Exception.Program03;

public class VotingRegistrationException extends RuntimeException
{
	public VotingRegistrationException(String str)
	{
		super(str);
	}
}
