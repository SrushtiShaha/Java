package Array;

public class Array_Element_Addition 
{
	public void Addition()
	{
		int Num[] = { 7, 3, 4, 6, 2 };
		int Add = 0;
		
		for( int i = 0; i < Num.length; i++ )
		{
			Add = Add + Num[i];
		}
		
		System.out.println("Addition Of Given Array -> " + Add);
	}
	
	public static void main(String[] args) 
	{
		Array_Element_Addition Obj = new Array_Element_Addition();
		Obj.Addition();
	}
}
