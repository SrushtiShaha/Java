package String;

public class Convert_To_Uppercase 
{
	public void Uppercase()
	{
		String Name = "Srushti";
		
		System.out.println("Given String -> " + Name);
		System.out.println("Uppercase -> " + Name.toUpperCase());
	}
	
	public static void main(String[] args) 
	{
		Convert_To_Uppercase Obj = new Convert_To_Uppercase();
		Obj.Uppercase();
	}
}
