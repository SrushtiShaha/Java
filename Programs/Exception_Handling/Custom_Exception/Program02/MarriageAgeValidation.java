package Exception_Handling.Custom_Exception.Program02;

import java.util.Scanner;

public class MarriageAgeValidation 
{
	Scanner Obj = new Scanner(System.in);
	int MaleAge = Obj.nextInt();
	int FemaleAge = Obj.nextInt();
	
	public void marriageAgeValidation()
	{
		if(MaleAge >= 21 && FemaleAge >= 18)
		{
			System.out.println("You Are Eligible For Marrage.");
		}
		else
		{
			try
			{
				throw new CantRegisterException("You Are Not Eligible For Registration.");
			}
			catch(CantRegisterException e)
			{
				System.out.println(e);
				System.out.println("Yanda Kartaya Nahi");
			}
		}
		System.out.println("Program End.");
	}
}
