package Collection.Map.PojoClass;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public class Main 
{
	public static void main(String[] args) 
	{
		HashMap<String, Employee> hm = new HashMap();
		
		Employee e1 = new Employee(12, "Akash", 15000, "Trainer");
		
		Employee e2 = new Employee();
		e2.setEmpId(13);
		e2.setEmpName("Shiv");
		e2.setEmpSalary(20000);
		e2.setEmpDepartment("HR");
		
		Employee e3 = new Employee(14, "Harshal", 25000, "Management");
		
		Employee e4 = new Employee(15, "Srushti", 150000, "Student");
		
		String k1 = "abc";
		String k2 = "pqr";
		String k3 = "xyz";
		String k4 = "lmn";
		
		hm.put(k1, e1);
		hm.put(k2, e2);
		hm.put(k3, e3);
		hm.put(k4, e4);
		
		hm.put("hij", new Employee(16, "Chaitnya", 30000, "Sales"));
		
		System.out.println(hm);

		System.out.println("-------------Random------------");
		
		Collection<Employee> c = hm.values();
		
		for(Employee e : c)
		{
			System.out.println(e);
		}

		System.out.println("-------------Sort By Id------------");
		
		ArrayList<Employee> al = new ArrayList(c);
		
		Collections.sort(al, new SortById());
		
		for(Employee e : al)
		{
			System.out.println(e);
		}
		
		System.out.println("-------------Sort By Name------------");
	
		Collections.sort(al, new SortByName());
		
		for(Employee e : al)
		{
			System.out.println(e);
		}
		
		System.out.println("-------------Sort By Salary------------");
		
		System.out.println("-------------Low To High------------");
	
		Collections.sort(al, new SortBySalary01());
		
		for(Employee e : al)
		{
			System.out.println(e);
		}

		System.out.println("-------------High To Low------------");
	
		Collections.sort(al, new SortBySalary02());
		
		for(Employee e : al)
		{
			System.out.println(e);
		}
		
		System.out.println("-------------Sort By Department------------");
		
		Collections.sort(al, new SortByDepartment());
		
		for(Employee e : al)
		{
			System.out.println(e);
		}
	}
}
