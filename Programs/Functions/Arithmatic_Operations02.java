package Functions;

public class Arithmatic_Operations02 
{
	int No1 = 100, No2 = 5;
	
	public int Add()
	{
		int Add = No1 + No2;
		return Add;
	}
	
	public int Sub()
	{
		Arithmatic_Operations02 Obj = new Arithmatic_Operations02();
		int Add = Obj.Add();
		int Sub = Add - 5;
		return Sub;
	}
	
	public int Mult()
	{
		Arithmatic_Operations02 Obj = new Arithmatic_Operations02();
		int Sub = Obj.Sub();
		int Mult = Sub * 5;
		return Mult;
	}
	
	public int Div()
	{
		Arithmatic_Operations02 Obj = new Arithmatic_Operations02();
		int Mult = Obj.Mult();
		int Div = Mult / 5;
		return Div;
	}
	
	public int Mod()
	{
		Arithmatic_Operations02 Obj = new Arithmatic_Operations02();
		int Div = Obj.Div();
		int Mod = Div % 5;
		return Mod;
	}
	
	public static void main(String[] args) 
	{
		Arithmatic_Operations02 Obj = new Arithmatic_Operations02();
		System.out.print("\n Addition -> ");
		System.out.println(Obj.Add());
		System.out.print("\n Substraction -> ");
		System.out.println(Obj.Sub());
		System.out.print("\n Multiplication -> ");
		System.out.println(Obj.Mult());
		System.out.print("\n Division -> ");
		System.out.println(Obj.Div());
		System.out.print("\n Reminder -> ");
		System.out.println(Obj.Mod());
	}
}
