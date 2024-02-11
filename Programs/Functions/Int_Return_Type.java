package Functions;

public class Int_Return_Type 
{
	int No1 = 10, No2 = 2;
	public int Div()
	{
		int Div = No1 / No2;
		System.out.println("Inside Division Method -> " + Div);
		return Div;
	}
	
	public static void main(String[] args) 
	{
		Int_Return_Type Obj = new Int_Return_Type();
		System.out.println("Inside Main Method -> " + Obj.Div());
	}
}
