package Constructor.Non_Paremeterised;

public class Constructor_Value_Changing 
{
	int a, b;
	
	public Constructor_Value_Changing(int a, int b, char ch)
	{
		//int a = 100; // 0
		//int b = 50; // 0
		//a = 100; // 100
		//b = 50; // 50
		//this.a = 100; // 100
		//this.b = 50; // 50
		//int a = this.a; // 0
		//int b = this.b; // 0
		this.a = a; // 20
		this.b = b; // 30
	}
	
	public static void main(String[] args) 
	{
		Constructor_Value_Changing Obj = new Constructor_Value_Changing(20,30,'S');
		System.out.println(Obj.a);
		System.out.println(Obj.b);
	}
}
