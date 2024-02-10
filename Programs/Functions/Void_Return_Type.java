package Functions;

public class Void_Return_Type 
{
	public void Div( int No1, int No2 )
	{
		int Div = No1 / No2;
		System.out.println(Div);
	}
	
	public static void main(String[] args) 
	{
		Void_Return_Type Obj = new Void_Return_Type();
		Obj.Div(10, 5);
	}
}
