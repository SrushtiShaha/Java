package MultiThreading.Program02;

public class Class_Main 
{
	public static void main(String[] args) 
	{
		Print_Numbers Obj1 = new Print_Numbers();
		Print_Numbers Obj2 = new Print_Numbers();
		Print_Numbers Obj3 = new Print_Numbers();
		
		Obj1.start();
		Obj2.start();
		Obj3.start();
	}
}
