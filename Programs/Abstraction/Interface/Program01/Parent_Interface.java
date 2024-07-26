package Abstraction.Interface.Program01;

public interface Parent_Interface 
{
	public abstract void M1();
	void M2();
	void M3();
	
	public static void M4()
	{
		System.out.println("Parent_Interface M4 Method");
		Parent_Interface Obj = new Child_Interface();
		Obj.M5();
	}
	
	private void M5()
	{
		System.out.println("Parent_Interface M5 Method");	
	}
}
