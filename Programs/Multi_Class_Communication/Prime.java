package Multi_Class_Communication;

public class Prime 
{
	public void Prm()
	{
		int No = 11, i = 1, Cnt = 0;
		
		while( i <= No ) 
		{
			if( No % i == 0 ) 
			{
				Cnt++;
			}
			
			i++;
		}
		
		if( Cnt == 2 ) 
		{
			System.out.println("Given Number " + No + " Is A Prime Number.");
		}
		else 
		{
			System.out.println("Given Number " + No + " Is Not Prime Number.");
		}
	}
}
