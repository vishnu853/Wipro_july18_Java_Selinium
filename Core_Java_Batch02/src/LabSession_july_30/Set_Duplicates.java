package LabSession_july_30;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class Set_Duplicates 
{
	public static void main(String[] args)
	{
		
		int arr[]= {10,20,30,40,50,30,20};
		
		
		Set<Integer> uniSet=new HashSet<Integer>();
		Set<Integer> duplicate=new HashSet<Integer>();
		
		for(int num: arr)
		{
			if(!uniSet.add(num))
			{
				duplicate.add(num);
			}
		}
		
		
		 
	}
}
