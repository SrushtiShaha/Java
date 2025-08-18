package MultiThreading.Program03;

public class Class_Main 
{
	public static void main(String[] args) 
	{
		ReverserNumber r = new ReverserNumber();
		Thread t = new Thread(r);
		t.start();
		
		SerialNumber s = new SerialNumber();
		s.start();
	}
}
