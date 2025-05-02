package Exception_Handling.Custom_Exception.Program03;

import java.util.Scanner;

public class VotingAgeValidation 
{
	Scanner Obj = new Scanner(System.in);
	int Age = Obj.nextInt();
	
	public void votingAgeValidation()
	{
		if(Age >= 18)
		{
			System.out.println("You Are Eligible For Voting.");
		}
		else
		{
			try
			{
				throw new VotingRegistrationException("You Are Not Eligible For Voting.");
			}
			catch(VotingRegistrationException e)
			{
				System.out.println(e);
				System.out.println("You Are Smaller Than 18 Years.\nTry After " + (18-Age) + " Years.");
			}
		}
		System.out.println("Program End.");
	}
}
