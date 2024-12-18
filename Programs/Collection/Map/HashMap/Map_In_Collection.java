package Collection.Map.HashMap;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;

public class Map_In_Collection 
{
	public static void main(String[] args) 
	{
		HashMap<Integer, String> hm = new HashMap();
		
		hm.put(1, "Srushti");
		hm.put(2, "Dimple");
		hm.put(3, "Pooja");
		hm.put(4, "Nidhi");
		hm.put(5, "Khushi");
		hm.put(6, "Mayuri");
		
		String s = hm.get(3);
		System.out.println(s);
		
//		for(Entry<Integer, String> e : hm.entrySet())
//		{
//			System.out.println(e);
//		}
		
		LinkedHashMap<Integer, String> lhm = new LinkedHashMap();
		
		lhm.put(1, "Srushti");
		lhm.put(2, "Dimple");
		lhm.put(3, "Pooja");
		lhm.put(4, "Nidhi");
		lhm.put(5, "Khushi");
		lhm.put(6, "Mayuri");
		
		String s1 = hm.get(3);
		System.out.println(s1);
		
//		for(Entry<Integer, String> e1 : lhm.entrySet())
//		{
//			System.out.println(e1);
//		}
		
		System.out.println(lhm.containsKey("Srushti"));
		System.out.println(lhm.containsKey(2));
		
		Set st = lhm.keySet();
		System.out.println(st);
	}
}
