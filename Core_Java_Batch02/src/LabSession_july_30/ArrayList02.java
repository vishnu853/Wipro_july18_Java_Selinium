package LabSession_july_30;

import java.util.ArrayList;

public class ArrayList02 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> ai=new ArrayList<Integer>();
		
		ai.add(23);
		ai.add(67);
		ai.add(83);
		ai.add(57);
		ai.add(3);
		ai.add(677);
		ai.add(234);
		ai.add(7);
		
		System.out.println(ai);
		
		ai.sort(null);
		System.out.println(ai);
	}
}
