public class GradeSystem
{
	public static void main(String args[])
	{
		String Grade = "A";
		
		switch(Grade)
		{
			case "A+":
				System.out.println("\n You Get 90+ Marks.");
				break;
			case "A":
				System.out.println("\n You Get 90 Below And 70 Above.");
				break;
			case "B":
				System.out.println("\n You Get 70 Below And 60 Above.");
				break;
			case "C":
				System.out.println("\n You Get 60 Below And 50 Above.");
				break;
			case "D":
				System.out.println("\n You Get 50 Below And 35 Above.");
				break;
			case "F":
				System.out.println("\n You Get Fail.");
				break;
			default:
				System.out.println("\n Enter Valid Input.");
				break;
		}
	}
}