package Functions;

public class Using_This_Keyword 
{
	int No1 = 20, No2 = 10;
	
	public void Div(int No1, int No2)
	{
		System.out.println("No1 = " + this.No1);
		System.out.println("No2 = " + this.No2);
	}
	
	public static void main(String[] args) 
	{
		Using_This_Keyword Obj = new Using_This_Keyword();
		Obj.Div(100,50);
	}
}
