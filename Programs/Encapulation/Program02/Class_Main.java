package Encapulation.Program02;

public class Class_Main 
{
	public static void main(String[] args)
	{
		Class_Student Obj1 = new Class_Student();
		Obj1.SetName("Srushti Shaha");
		Obj1.SetRollNo(1);
		Obj1.SetMobNo(9099009999l);
		Obj1.SetEMail("srushti@gmail.com");
		
		Class_Student Obj2 = new Class_Student();
		Obj2.SetName("Sakshi Shaha");
		Obj2.SetRollNo(2);
		Obj2.SetMobNo(8937587465l);
		Obj2.SetEMail("sakshi@gmail.com");
		
		Class_Student Obj3 = new Class_Student();
		Obj3.SetName("Mayuri Shaha");
		Obj3.SetRollNo(3);
		Obj3.SetMobNo(7083487225l);
		Obj3.SetEMail("mayuri@gmail.com");
		
		System.out.println(Obj1.GetName());
		System.out.println(Obj1.GetRollNo());
		System.out.println(Obj1.GetMobNo());
		System.out.println(Obj1.GetEMail());
		
		System.out.println("********************");
		
		System.out.println(Obj2.GetName());
		System.out.println(Obj2.GetRollNo());
		System.out.println(Obj2.GetMobNo());
		System.out.println(Obj2.GetEMail());
		
		System.out.println("********************");
		
		System.out.println(Obj3.GetName());
		System.out.println(Obj3.GetRollNo());
		System.out.println(Obj3.GetMobNo());
		System.out.println(Obj3.GetEMail());
		System.out.println(Obj1);
	}
}
