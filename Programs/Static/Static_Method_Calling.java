package Static;

public class Static_Method_Calling 
{
	public void M1()
	{
		System.out.println("M1 Method");
	}
	
	static
	{
		System.out.println("Static Block");
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Main Method");
		Static_Method_Calling Obj = new Static_Method_Calling();
		Obj.M1();
	}
}
