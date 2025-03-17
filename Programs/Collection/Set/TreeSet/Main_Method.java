package Collection.Set.TreeSet;

import java.util.*;

public class Main_Method 
{
	public static void main(String[] args) 
	{
		TreeSet al = new TreeSet();
		
		Student s1 = new Student();
		s1.setID(1);
		s1.setName("Srushti");
		s1.setBranch("BCA");
		Student s2 = new Student();
		s2.setID(2);
		s2.setName("Sakshi");
		s2.setBranch("BCA");
		Student s3 = new Student();
		s3.setID(3);
		s3.setName("Mayuri");
		s3.setBranch("BCA");
		Student s4 = new Student();
		s4.setID(4);
		s4.setName("Pooja");
		s4.setBranch("BCA");
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		
//		ArrayList al = new ArrayList();
		
		System.out.println("--------------");
		
		for(Object o:al)
		{
			System.out.println(o);
		}
	}
}
