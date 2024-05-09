package String;

public class Trim_Method 
{
	public void Using_Trim()
	{
		String Name = "   Srushti Sudhir Shaha    ";
		
		System.out.println("Given String -> " + Name);
		
		Name = Name.trim();
		
		System.out.println("After Using Trim Method -> " + Name);
	}
	
	public static void main(String[] args) 
	{
		Trim_Method Obj = new Trim_Method();
		Obj.Using_Trim();
	}
}
