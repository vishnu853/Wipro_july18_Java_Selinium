package collections;

import java.util.ArrayList;

public class Array_List
{
	public static void main(String[] args) 
	{
		ArrayList<String> al=new ArrayList<String>();
		
		al.add("Vishnu");
		al.add("Vardhan");
		al.add("Vikram");
		al.add("Sai");
		al.add("Narsihma");
		al.add("Sasank");
		al.add("Bharath");
		al.add(null);
		
		System.out.println(al);
		System.out.println(al.get(2));
		System.out.println(al.indexOf("Vikram"));
		System.out.println(al.isEmpty());
		System.out.println(al.remove(4));
		System.out.println(al);
		System.out.println(al.set(4, "King"));
		System.out.println(al);
		System.out.println(al.size());
		
		
	}
}
