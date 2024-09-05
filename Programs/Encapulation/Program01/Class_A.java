package Encapulation.Program01;

public class Class_A 
{
	private int a;
	private int b;
	
	public Class_A( int a, int b )
	{
		this.a = a;
		this.b = b;
	}
	
	public void M1( int a, int b )
	{
		this.a = a;
		this.b = b;
	}
	
	public void Display()
	{
		System.out.println(a);
		System.out.println();
	}
}
