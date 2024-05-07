package String;

public class PickMyChar 
{
	public void PickChar()
	{
		String s = "Srushti";

		char a = s.charAt(3);
		System.out.println("Character On Given Index -> " + a);
		
		System.out.println("Characters In Given String -> ");
		
		for( int i = 0; i < s.length(); i++)
		{
			a = s.charAt(i);
			System.out.println(a);
		}
	}
	
	public static void main(String[] args) 
	{
		PickMyChar Obj = new PickMyChar();
		Obj.PickChar();
	}
}
