public class Age_Eligiblity
{
	public static void main(String args[])
	{
		int Age = 40;
		
		if( Age >= 18)
		{
			System.out.println("\n You Are Eligible For Voting.");
			
			if( Age >= 25 )
			{
				System.out.println("\n You Are Eligible For Vidhansabha.");
			
				if( Age >= 35 )
				{
					System.out.println("\n You Are Eligible For Vidhan Parishad.");
				
					if( Age >= 40 )
					{
						System.out.println("\n You Are Eligible For C.M.");
		
						if( Age >= 60 )
						{
							System.out.println("\n You Are Eligible For P.M.");
						}
						else
						{
							System.out.println("\n You Are Not Eligible For P.M.");
						}
					}
					else
					{
						System.out.println("\n You Are Not Eligible For C.M.");
					}
				}
				else
				{
					System.out.println("\n You Are Not Eligible For Vidhan Parishad.");
				}
			}
			else
			{
				System.out.println("\n You Are Not Eligible For Vidhansabha.");
			}
		}
		else	
		{
			System.out.println("\n You Are Not Eligible For Voting.");
		}
	}
}