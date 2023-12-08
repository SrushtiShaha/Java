public class Job_Eligiblity
{
	public static void main(String args[])
	{
		String Qualification = "MCA", Experience = "1+";
		
		if( (Qualification == "BCA") || (Experience == "1+") )
		{
			System.out.println("\n You Are Eligible For Job.");
		}
		else	
		{
			System.out.println("\n You Are Not Eligible For Job.");
		}
	}
}