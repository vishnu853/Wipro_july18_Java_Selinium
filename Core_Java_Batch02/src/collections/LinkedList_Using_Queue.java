package collections;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedList_Using_Queue
{
	public static void main(String[] args) 
	{
		Queue<String> lang=new LinkedList<String>();
		
		lang.add("Java");
		lang.add("Python");
		lang.add("C");
		lang.add("C++");
		
		System.out.println(lang);
		System.out.println(lang.peek());
		System.out.println(lang.remove());
		System.out.println(lang);
	}
}
