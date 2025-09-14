package MultiThreading.Synchronization.Program01;

public class Produce extends Thread
{
	Company c;
	
	public Produce(Company c)
	{
		this.c = c;
	}
	public void run()
	{
		for(int i = 1; i <= 10; i++)
		{
			c.Produce(i);
		}
	}
}
