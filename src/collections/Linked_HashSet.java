package collections;

import java.util.LinkedHashSet;

public class Linked_HashSet 
{
	public static void main(String[] args) 
	{
		LinkedHashSet<String> lhs=new LinkedHashSet<String>();
		
		//no duplicates
		//insertion order
		//one null is allowed
		//not synchronized
		//slightly slower than hashset
		
		
		lhs.add("Apple");
		lhs.add("Banana");
		lhs.add("Mango");
		lhs.add("Watermelon");
		lhs.add("Pineapple");
		lhs.add("Grapes");
		lhs.add("Muskmelon");
		lhs.add("Banana");
		lhs.add(null);
		lhs.add(null);
		
		System.out.println(lhs);
		System.out.println(lhs.contains("Apple"));
	}
}
