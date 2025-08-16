package core_java;

import java.util.Iterator;

public class SingleDimensionalArray 
{
	public static void main(String[] args) 
	{
		int a[]=new int[5];
		
		String[] names= {"vishnu","alice","peter","vijay"};
		
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		
		for(int i=0; i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		System.out.println(a[1]);
	}
}
