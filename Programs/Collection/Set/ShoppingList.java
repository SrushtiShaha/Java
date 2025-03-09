package Collection.Set;

import java.util.*;

public class ShoppingList 
{
	public static void main(String[] args) 
	{
		Set s = new HashSet();
		
		s.add(132);
		s.add(876);
		s.add(984);
		s.add(345);
		System.out.println(s);
		
		System.out.println("-----------------------");
		
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add(132);
		lhs.add(876);
		lhs.add(984);
		lhs.add(345);
		System.out.println(lhs);
		
		System.out.println("-----------------------");
		
		TreeSet ts = new TreeSet();
//		ts.add(132);
//		ts.add(876);
//		ts.add(984);
//		ts.add(345);
//		ts.add(132);
		ts.add("sss");
		ts.add("aaa");
		ts.add("ccc");
		ts.add("bbb");
		ts.add("sss");
		System.out.println(ts);
		
		System.out.println("-----------------------");
		
		Iterator itr = ts.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
