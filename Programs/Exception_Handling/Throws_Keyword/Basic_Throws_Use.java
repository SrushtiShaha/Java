package Exception_Handling.Throws_Keyword.Program01;

public class Basic_Throws_Use 
{
	public void Add() throws ArithmeticException
	{
		int a = 10;
		int b = 0;
		System.out.println(a/b);
	}
	
	public void Information() throws StringIndexOutOfBoundsException
	{
		String Name = "Srushti";
		System.out.println(Name.charAt(9));
	}
	
	public void Array() throws ArrayIndexOutOfBoundsException
	{
		int a[] = {1, 2};
		System.out.println(a[3]);
	}
}
