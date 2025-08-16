package collections;

import java.util.LinkedList;

public class LinkedListEg 
{
	public static void main(String[] args)
	{
		LinkedList<String> li=new LinkedList<String>();
		
		li.add("Vishnu");
		li.add("Vardhan");
		li.add("Vikram");
		li.add("Sai");
		
		System.out.println(li);
		
		li.addFirst("Sasank");
		li.addLast("Narsihma");
		
		System.out.println(li);
		
		li.removeFirst();
		li.removeLast();
		System.out.println(li);
		
		
	}
}
