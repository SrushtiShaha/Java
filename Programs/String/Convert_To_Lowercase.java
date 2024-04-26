package String;

public class Convert_To_Lowercase 
{
	public void Lowercase()
	{
		String Name = "SRUSHTI";
		
		System.out.println("Given String -> " + Name);
		System.out.println("Lowercase -> " + Name.toLowerCase());
	}
	
	public static void main(String[] args) 
	{
		Convert_To_Lowercase Obj = new Convert_To_Lowercase();
		Obj.Lowercase();
	}
}
