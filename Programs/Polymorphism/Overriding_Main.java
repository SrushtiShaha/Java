package Polymorphism;

public class Overriding_Main 
{
	public static void main(String[] args) 
	{
		Overriding_Child Obj1 = new Overriding_Child();
		Obj1.M1();
		Obj1.M2();
		Obj1.M3();
		
		Overriding_Parent Obj2 = new Overriding_Parent();
		Obj2.M1();
		Obj2.M2();
		
		// Overreaden method
		Overriding_Parent Obj3 = new Overriding_Child();
		Obj3.M1();
		Obj3.M2();
		// Obj3.M3();
	}
}
