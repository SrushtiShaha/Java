package Encapulation.Program01;

public class Class_Main 
{
	public static void main(String[] args) 
	{
		Class_A Obj = new Class_A( 5, 10 );
		Obj.M1(1, 2);
		Obj.Display();
//		System.out.println(Obj.a); - Error
//		System.out.println(Obj.b); - Error
	}
}
