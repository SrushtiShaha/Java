package MultiThreading.Program03;

public class ReverserNumber implements Runnable
{
	public void run()
	{
		for( int i = 10; i >= 1; i-- )
		{
			System.out.println("Reverse Number -> " + i);
		}
	}
}
