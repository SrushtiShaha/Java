package Constructor.Paremeterised;

public class Addition 
{
	int No1, No2;
	public Addition()
	{
		No1 = 90;
		No2 = 10;
	}
	
	public Addition( int p, int q)
	{
		//No1 = p;
		//No2 = q;
		No1 = No1;
		No2 = No2;
	}
	
	public void Add()
	{
		int Ans = No1 + No2;
		System.out.println(Ans);
	}
}
