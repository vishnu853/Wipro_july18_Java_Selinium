package collections;

import java.util.Stack;

public class Stack_Ex 
{
	public static void main(String[] args) 
	{
		Stack<String> s=new Stack<String>();
		
		s.push("Vishnu");
		s.push("Uday");
		s.push("Varsha");
		s.push("Murli");
		s.push("David");
		s.push("Sunny");
		
		System.out.println(s);
		
		s.pop();
		System.out.println(s);
		
		System.out.println(s.peek());
		
		System.out.println(s.empty());
		
		System.out.println(s.search("Uday"));
		
		s.add("Arun");
		System.out.println(s);
		
		s.addElement("obj");
		System.out.println(s);
		
		System.out.println(s.firstElement());
		
		s.removeElementAt(5);
		System.out.println(s);
		
		System.out.println(s.lastIndexOf(s));
		
		System.out.println(s.get(4));
		
		s.ensureCapacity(10);
		System.out.println(s);
		
		s.removeElementAt(2);
		System.out.println(s);
		
		s.toString();
		System.out.println(s);
		
		s.hashCode();
		System.out.println(s);
		
		s.remove(0);
		System.out.println(s);
	}
}
