package collections;

import java.util.TreeSet;

public class Tree_Set
{
	public static void main(String[] args) 
	{
		TreeSet<String> ts=new TreeSet<String>();
		
		//No dupiclate elements
		// alphabetical order
		
		ts.add("Orange");
		ts.add("Green");
		ts.add("White");
		ts.add("Blue");
		ts.add("Red");
		ts.add("Pink");
		ts.add("Green");
		ts.add("Null");
		
		System.out.println(ts);
		
		
		
		System.out.println(ts.contains("Green"));
	}
}
