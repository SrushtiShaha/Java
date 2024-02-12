package Functions;

public class Change_Value 
{
	int No1 = 50, No2 = 10;
	
	public void ChangeValue()
	{
		No1 = 2;
		No2 = 4;
	}
	
	public void Add()
	{
		int Add = No1 + No2;
		System.out.print("\n Addition -> " + Add);
	}
	
	public static void main(String[] args) 
	{
		Change_Value Obj1 = new Change_Value();
		Obj1.Add();
		Obj1.ChangeValue();
		Obj1.Add();
		
		Change_Value Obj2 = new Change_Value();
		Obj2.Add();
	}
}
