public class Job_Critaria
{
	public static void main(String args[])
	{
		String Gratuation = "BCA";
		
		if( Gratuation == "BCA" )
		{
			System.out.println("\n You Are Eligible For Job.");

			 String PostGratuation = "MCA";
			
			if( PostGratuation == "MCA" )
			{
				System.out.println("\n You Are Selected In Interview.");

				int Project = 3;
			
				if( Project >= 2 )
				{
					System.out.println("\n You Will Get 1 Year Experience.");

					int Experience = 2;
				
					if( Experience >= 1 )
					{
						System.out.println("\n You Will Get Promotion.");
					}
					else
					{
						System.out.println("\n You Will Get Promotion.");
					}
				}
				else
				{
					System.out.println("\n You Will Not Get Experience.");
				}
			}
			else
			{
				System.out.println("\n You Are Not Selected In Interview.");
			}
		}
		else	
		{
			System.out.println("\n You Are Not Eligible For Job.");
		}
	}
}