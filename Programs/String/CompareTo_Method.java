package String.Ready_Made_Functions;

public class CompareTo_Method 
{
	public static void main(String[] args) 
	{
		String Name = "Srushti";
		String Surname = "Sru";
		
		int Gap = Name.compareTo(Surname);
		System.out.println(Gap);
		
		Gap = Surname.compareTo(Name);
		System.out.println(Gap);
	}
}
