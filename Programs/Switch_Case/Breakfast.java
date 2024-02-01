public class Breakfast
{
	public static void main(String args[])
	{
		String Day = "Monday";
		
		System.out.println("\n Menu For Day -> " + Day);
		
		switch(Day)
		{
			case "Sunday":
				System.out.println("\n\t Pav Bhaji.");
				break;

			case "Monday":
				System.out.println("\n\t Misal");
				break;

			case "Tuesday":
				System.out.println("\n\t Idli");
				break;

			case "Wednesday":
				System.out.println("\n\t Dosa");
				break;

			case "Thursday":
				System.out.println("\n\t Uttappa");
				break;

			case "Friday":
				System.out.println("\n\t Poha");
				break;

			case "Saturday":
				System.out.println("\n\t Menduvada");
				break;

			default:
				System.out.println("\n\t Invalid Day.");
				break;
		}
	}
}