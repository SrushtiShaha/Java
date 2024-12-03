package Collection.List.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class Program01 
{
	public static void main(String[] args) 
	{
		System.out.println("-------Create-------");
		LinkedList ll = new LinkedList();
		
		ll.add(12);
		ll.add(34);
		ll.add("Abc");
		ll.add("Karad");
		
		System.out.println("-------Print-------");
		System.out.println(ll);
		
		System.out.println("-------Read-------");

		Iterator itr = ll.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

		System.out.println("-------Update-------");
		ll.set(2, "Satara");
		
		System.out.println(ll);
		
		System.out.println("-------Delete-------");
		ll.remove(1);
		
		System.out.println(ll);
	}
}
