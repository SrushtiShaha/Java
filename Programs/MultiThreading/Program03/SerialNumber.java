package MultiThreading.Program03;

public class SerialNumber extends Thread
{
	public void run()
	{
		for( int i = 1; i <= 10; i++ )
		{
			System.out.println("Serial Number -> " + i);
		}
	}
}
