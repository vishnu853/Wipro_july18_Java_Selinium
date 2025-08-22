package collections;

import java.util.HashSet;

public class Hash_Set 
{
	public static void main(String[] args) 
	{
		HashSet<String> hs=new HashSet<String>();
		
		hs.add("Apple");
		hs.add("Banana");
		hs.add("Mango");
		hs.add("Watermelon");
		hs.add("Pineapple");
		hs.add("Grapes");
		hs.add("Muskmelon");
		hs.add("Banana");
		hs.add(null);
		hs.add(null);
		
		System.out.println(hs);
		System.out.println(hs.size());
		System.out.println(hs.isEmpty());
		
	}
}
