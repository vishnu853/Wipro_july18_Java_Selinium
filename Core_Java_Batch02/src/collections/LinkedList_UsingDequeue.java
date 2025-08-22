package collections;

import java.util.Deque;
import java.util.LinkedList;

public class LinkedList_UsingDequeue
{
	public static void main(String[] args)
	{
		Deque<String> lang=new LinkedList<String>();
		
		lang.add("Selinum");
		lang.add("DotNet");
		lang.add("Java");
		lang.add("Python");
		lang.add("C");
		lang.add("C++");
		
		System.out.println(lang);
		
		System.out.println();
		
		lang.addFirst("JavaScript");
		lang.addLast("HTML");
		
		System.out.println(lang);
		System.out.println();
		
		lang.removeFirst();
		lang.removeLast();
		
		System.out.println(lang);
		
		System.out.println();
		
		System.out.println(lang.peek());
		System.out.println(lang.peekFirst());
		System.out.println(lang.peekLast());
		
		
		
		
	}
}
