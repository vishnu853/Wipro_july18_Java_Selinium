package collections;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class Hash_Map 
{
	public static void main(String[] args) 
	{
		HashMap<Integer, String> map=new HashMap<Integer, String>();
		
		map.put(1, "Vishnu");
		map.put(2, "Vardhan");
		map.put(3, "Varsha");
		map.put(4, "Anil");
		map.put(5, "Dhanush");
		map.put(6, "Dhanush");
		map.put(3, "Varun");
		map.put(null, null);
		map.put(null, null);
		
		
	// 	System.out.println(map);
		
		//Converting Map into Set
		
		Set set=map.entrySet();
		
		Iterator itr =set.iterator();
		
		while (itr.hasNext())
		{
			Entry  entry=(Map.Entry) itr.next();
			System.out.println(entry.getKey()+": "+entry.getValue());
			
			
		}
	}
}
