package Abstraction.Abstract_Class.Program02;

public abstract class Parent_Class 
{
	public abstract void Add();
	public abstract void Sub();
	public void Mult()
	{
		System.out.println("Parent_Class Mult Method.");
		System.out.println("Multiplication -> 20 * 10 = " + (20*10));
	}
	
	public void Div()
	{
		System.out.println("Parent_Class Div Method.");
		System.out.println("Division -> 20 / 10 = " + (20/10));
	}

	public void Mod()
	{
		System.out.println("Parent_Class Mod Method.");
		System.out.println("Reminder -> 20 / 10 = " + (20/10));
	}
}
