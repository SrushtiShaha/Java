package Abstraction.Interface.Program01;

public class Main_Class 
{
	public static void main(String[] args) 
	{
		Parent_Interface Obj = new Child_Interface();
		Obj.M1();
		Obj.M2();
		Obj.M3();
		Parent_Interface.M4();
	}
}
