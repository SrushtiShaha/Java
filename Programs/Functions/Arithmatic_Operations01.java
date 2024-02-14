package Functions;

public class Arithmatic_Operations01 
{
	// With Return Type
	int No1 = 100, No2 = 10, Ans = 0;
	
	public void Add() 
	{
		Ans = No1 + No2;
		System.out.println("\n Addition -> " + No1 + " + " + No2 + " = " + Ans);
	}
	
	public void Sub()
	{
		Ans = No1 - No2;
		System.out.println("\n Substraction -> " + No1 + " - " + No2 + " = " + Ans);
	}
	
	public void Mult()
	{
		Ans = No1 * No2;
		System.out.println("\n Multiplication -> " + No1 + " * " + No2 + " = " + Ans);
	}
	
	public void Div()
	{
		Ans = No1 / No2;
		System.out.println("\n Division -> " + No1 + " / " + No2 + " = " + Ans);
	}
	
	public void Mod()
	{
		Ans = No1 % No2;
		System.out.println("\n Reminder -> " + No1 + " % " + No2 + " = " + Ans);
	}
	
	public static void main(String[] args) 
	{
		Arithmatic_Operations01 Obj = new Arithmatic_Operations01();
		Obj.Add();
		Obj.Sub();
		Obj.Mult();
		Obj.Div();
		Obj.Mod();
	}
}
