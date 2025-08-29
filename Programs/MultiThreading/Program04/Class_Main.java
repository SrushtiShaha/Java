package MultiThreading.Program04;

public class Class_Main 
{
	public static void main(String[] args) 
	{
		ReverseNumber r = new ReverseNumber();
		Thread t = new Thread(r);
		t.start();
		t.run();
	}
}
