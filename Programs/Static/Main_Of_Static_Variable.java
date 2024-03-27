package Static;

public class Main_Of_Static_Variable 
{
	public static void main(String[] args) 
	{
		Static_Variable Obj = new Static_Variable();
		Static_Variable Obj1 = new Static_Variable();
		Static_Variable Obj2 = new Static_Variable();
		System.out.println(Obj.b);
		System.out.println(Obj.a);
		System.out.println(Obj1.a);
		System.out.println(Obj2.a);
		Obj.a = 10;
		System.out.println(Obj.a);
	}
}
