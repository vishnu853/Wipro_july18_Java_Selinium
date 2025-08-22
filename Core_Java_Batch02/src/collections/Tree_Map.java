package collections;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Tree_Map 
{
	public static void main(String[] args)
	{
		TreeMap<Integer, String> map=new TreeMap<Integer, String>();
		
		map.put(1, "Vishnu");
		map.put(2, "Vardhan");
		map.put(3, "Varsha");
		map.put(4, "Anil");
		map.put(5, "Dhanush");
		map.put(6, "Dhanush");
		map.put(1, "Varun");
		
	//	System.out.println(map);
		
		Set set=map.entrySet();
		
		Iterator itr=set.iterator();
		
		while (itr.hasNext()) 
		{
			Entry entry=(Map.Entry) itr.next();
			
			System.out.println(entry.getKey()+": "+entry.getValue());
		}
	}
}
