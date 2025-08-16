package LabSession_july_30;

import java.util.LinkedList;

public class Linked_List 
{
	public static void main(String[] args) 
	{
		LinkedList<Integer> l1=new LinkedList<Integer>();
		
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		
		LinkedList<Integer> l2= new LinkedList<Integer>();
		
		l2.add(10);
		l2.add(30);
		l2.add(30);
		l2.add(40);
		
		if(l1.equals(l2))
		{
			System.out.println("Both are equal");
		}
		else {
			System.out.println("Both are not equal");
		}
		
	}
}
