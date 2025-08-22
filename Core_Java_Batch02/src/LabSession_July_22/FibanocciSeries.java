package LabSession_July_22;

import java.util.Iterator;

public class FibanocciSeries 
{
	public static void main(String[] args) 
	{
		int num=8;
		int a=0;
		int b=1;
		
		for(int i=0;i<=num;i++)
		{
			System.out.print(a+ " " );
			int c=a+b;
			a=b;
			b=c;
		}
	}
}
