package Functions;

public class Parametarized_Method 
{
	int No1 = 20, No2 = 10;
	
	public void Div(int No1, int No2)
	{
		int Div = No1 / No2;
		System.out.println(Div);
	}
	
	public static void main(String[] args) 
	{
		Parametarized_Method Obj = new Parametarized_Method();
		Obj.Div(50, 5);
	}
}
