package Polymorphism;

public class Overloding 
{
	public void M1(int N)
	{
		System.out.println("Overloding Class Single Parameter Int.");
	}
	
	public void M1(String S)
	{
		System.out.println("Overloding Class Single Parameter String.");
	}

	public void M1(int No, char ch)
	{
		System.out.println("Overloding Class Double Parameter Int And Char.");
	}
}
