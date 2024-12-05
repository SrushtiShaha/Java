package Collection.List.Vector;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class PlayersList 
{
	public static void main(String[] args) 
	{
		System.out.println("-------LinkedList-------");
		LinkedList menCricketList = new LinkedList();
		
		menCricketList.add("Rohit");
		menCricketList.add("Ishan");
		menCricketList.add("Hardik");
		
		System.out.println("-------Vector-------");
		Vector womenCricketList = new Vector();

		womenCricketList.add("Rani");
		womenCricketList.add("Aishwarya");
		womenCricketList.add("Khushi");
		
		System.out.println("-------Stack-------");
		Stack KabbaddiPlayerList = new Stack();
		
		KabbaddiPlayerList.add("Mohit Chillar");
		KabbaddiPlayerList.add("Anup Kumar");
		KabbaddiPlayerList.add("Dipak Hudda");
		
		System.out.println("-------List-------");
		
		List ListForVisa = new LinkedList();
		ListForVisa.addAll(menCricketList);
		ListForVisa.addAll(womenCricketList);
		ListForVisa.addAll(KabbaddiPlayerList);
		
		System.out.println("List For Visa");
		Iterator itr = ListForVisa.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}
}
