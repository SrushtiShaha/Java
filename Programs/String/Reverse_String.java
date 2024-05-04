package String;

public class Reverse_String 
{
	public void Reverse()
	{
		String Name = "Java";
		String Reverse = "";
		
		System.out.println("Given String -> " + Name);
		
		int Length = Name.length();
		
		for( int i = (Length-1); i >= 0; i-- )
		{
			Reverse = Reverse + Name.charAt(i);
		}
		
		System.out.println("Reverse String -> " + Reverse);
	}
	public static void main(String[] args) 
	{
		Reverse_String Obj = new Reverse_String();
		Obj.Reverse();
	}
}
