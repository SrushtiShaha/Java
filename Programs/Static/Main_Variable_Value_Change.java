package Static;

public class Main_Variable_Value_Change 
{
	public static void main(String[] args) 
	{
		Variable_Value_Change a = new Variable_Value_Change(12, 34);
		a.c = 50;
		a.b = 1000;
		System.out.println(a.a); // 12
		System.out.println(a.b); // 1000
		Variable_Value_Change a1 = new Variable_Value_Change();
		System.out.println(a1.a); // 0
		System.out.println(a1.b); // 0
		System.out.println("-------------------");
		System.out.println(a.c); // 50
		System.out.println(a1.c); // 50
		Variable_Value_Change Obj = new Variable_Value_Change();
		System.out.println(Obj.c); // 50
		System.out.println("-------------------");
		System.out.println(Variable_Value_Change.c);
	}
}
