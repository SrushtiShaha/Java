package Polymorphism.Assignment.Q4_Assignment;

public class Class_Main 
{
	public static void main(String[] args) 
	{
		Class_Employee Obj1 = new Class_HR_Manager();
		Obj1.Work();
		Obj1.Get_Salary();
//		Obj1.Add_Employee();
		
		Class_HR_Manager Obj2 = new Class_HR_Manager();
		Obj2.Add_Employee();
	}
}
