package Collection.Queue.Program01;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Main_Class 
{
	public static void main(String[] args) 
	{
		PriorityQueue PQ = new PriorityQueue();		
		PQ.add(123);
		PQ.add(456);
		PQ.add(789);
		
		Iterator itr = PQ.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
