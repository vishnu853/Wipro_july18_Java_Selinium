package collections;

import java.util.Vector;

public class Vector_ex 
{
	public static void main(String[] args)
	{
		Vector<String> vec=new Vector<String>();
		
		vec.add("Vishnu");
		vec.add("Vijay");
		vec.add("Vikram");
		vec.add("Narasihma");
		vec.add("Katrhik");
		vec.add("Anil");
		
		System.out.println(vec);
		
		vec.add(3, "Dhanush");
		System.out.println(vec);
		
		vec.addElement("King");
		System.out.println(vec);
		
		System.out.println(vec.capacity());
		
		System.out.println(vec.clone());
		
		System.out.println(vec.equals("Vishnu"));
		
		System.out.println(vec.firstElement());
		
		System.out.println(vec.get(5));
		
		System.out.println(vec.isEmpty());
		
		System.out.println(vec.set(4, "Villa"));
		System.out.println(vec);
		
		System.out.println(vec.size());
		
		System.out.println(vec.addAll(vec));
		System.out.println(vec);
		
		System.out.println(vec.removeAll(vec));
		System.out.println(vec);
		
		
	}
}
