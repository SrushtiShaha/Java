package MultiThreading.Program02;

public class Print_Numbers extends Thread
{
	public void run()
	{
		for(int i = 1; i <= 10; i++)
		{
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
