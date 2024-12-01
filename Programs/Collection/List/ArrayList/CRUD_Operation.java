package Collection.List.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class CRUD_Operation 
{
	public static void main(String[] args) 
	{
		System.out.println("--------Create--------");
		ArrayList al = new ArrayList();
		al.add("Srushti");
		al.add("Sakshi");
		al.add("Mayuri");
		al.add("Pooja");
		al.add("Nidhi");
		
		System.out.println("--------Size--------");
		System.out.println("Array Size -> " + al.size());

		System.out.println("--------Read--------");
		for(int i = 0; i <= (al.size()-1); i++)
		{
			System.out.println(al.get(i));
		}

		System.out.println("--------Update--------");
		al.set(0, "Pratiksha");

		for(int i = 0; i <= (al.size()-1); i++)
		{
			System.out.println(al.get(i));
		}
		
		System.out.println("--------Delete--------");
		al.remove(0);
		
		for(int i = 0; i <= (al.size()-1); i++)
		{
			System.out.println(al.get(i));
		}
		
		System.out.println("--------Add On Specific Index--------");
		al.add(1, "Siddhi");
		
		for(int i = 0; i <= (al.size()-1); i++)
		{
			System.out.println(al.get(i));
		}

		System.out.println("--------Clone -> Make Duplicate Array--------");
		Object o = al.clone();
		
		for(int i = 0; i <= (al.size()-1); i++)
		{
			System.out.println(al.get(i));
		}
		
//		for(int i = 0; i <= (al.size()-1); i++)
//		{
//			System.out.println(al.get(i));
//		}
		
		System.out.println("--------Get Specific Index--------");
		int index = al.indexOf("Pooja");
		
		System.out.println("Index Number Of 'Pooja' -> " + index);
		
		System.out.println("\n--------Get All Object Without Condition--------");
		Iterator itr = al.iterator();
		
		while(itr.hasNext())
		{
			Object Obj = itr.next();
			System.out.println(Obj);
		}

		System.out.println("--------To Clear Array--------");
		al.clear();
	}
}
