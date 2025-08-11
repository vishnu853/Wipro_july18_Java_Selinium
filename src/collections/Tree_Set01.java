package collections;

import java.util.TreeSet;

public class Tree_Set01 
{
	public static void main(String[] args)
	{
		TreeSet<Integer> ts=new TreeSet<Integer>();
		
		//No dupiclate elements
		// alphabetical order
		
		ts.add(78);
		ts.add(14);
		ts.add(34);
		ts.add(19);
		ts.add(04);
		ts.add(100);
		ts.add(78);
		ts.add(14);
		
		System.out.println(ts);
	}
}
