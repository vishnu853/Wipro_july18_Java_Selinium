package LabSession_july_30;

import java.util.ArrayList;
import java.util.Collection;

public class ArrayList03 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		al.add(23);
		al.add(67);
		al.add(83);
		al.add(57);
		al.add(3);
		al.add(677);
		al.add(234);
		al.add(7);
		
		al.sort(null);
        int secondLarg = al.get(al.size() - 2);

        System.out.println("The second largest no. is: "+secondLarg);
        
       
	}
}
