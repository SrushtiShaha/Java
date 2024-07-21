package Abstraction.Abstract_Class.Program02;

public class Main_Class 
{
	public static void main(String[] args) 
	{
		Parent_Class Obj = new Child_Class();
		Obj.Add();
		Obj.Sub();
		Obj.Mult();
		Obj.Div();
		Obj.Mod();
	}
}
