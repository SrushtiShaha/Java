package Multi_Class_Communication;

public class Main_Of_Function_Calling 
{
	public static void main(String[] args) 
	{
		Function_Calling01 Obj = new Function_Calling01();
		Obj.M1();
		Obj.M2();
		Function_Calling02 Obj2 = new Function_Calling02();
		Obj2.M3();
		//Obj2.M1(); - Not Aloud
	}
}
