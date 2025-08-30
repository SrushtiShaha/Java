package MultiThreading.Program04;

public class ReverseNumber implements Runnable 
{
	public void run()
	{
		for(int i = 10; i <= 1; i--)
		{
			Thread t = Thread.currentThread();
			long id = t.getId();
			String name = t.getName();
			System.out.println(id + " " + name + " " + i);
		}
	}
}
