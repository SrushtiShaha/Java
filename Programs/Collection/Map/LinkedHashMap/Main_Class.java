package Collection.Map.LinkedHashMap;

import java.util.LinkedHashMap;

public class Main_Class 
{
	public static void main(String[] args) 
	{
		POJO_Class p = new POJO_Class();
		POJO_Class p1 = new POJO_Class();
		POJO_Class p2 = new POJO_Class();
		
		LinkedHashMap lhm = new LinkedHashMap();
		
		p.setRoll_No(1);
		p.setName("Srushti");
		p1.setRoll_No(2);
		p1.setName("Dimple");
		p2.setRoll_No(3);
		p2.setName("Srush");
		
		lhm.put(1, p);
		lhm.put(7, p1);
		lhm.put(5, p2);
		
		System.out.println(lhm);
	}
}
