public class Voting_Eligiblity
{
	public static void main(String args[])
	{
		int Age = 21;
		String Nationality = "Indian";
		
		if( (Age >= 18) || (Nationality == "Indian") )
		{
			System.out.println("\n You Are Eligible For Voting.");
		}
		else	
		{
			System.out.println("\n You Are Not Eligible For Voting.");
		}
	}
}