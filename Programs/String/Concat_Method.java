package String;

public class Concat_Method 
{
	public void Concat()
	{
		String Name = "Srushti";
		String Surname = " Shaha";
		
		System.out.println(Name.concat(Surname));
		System.out.println("Length -> " + Name.concat(Surname).length());
	}
	
	public static void main(String[] args) 
	{
		Concat_Method Obj = new Concat_Method();
		Obj.Concat();
	}
}
