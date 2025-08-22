package LabSession_July_22;

public class Factorial_Program 
{
	public static void main(String[] args)
	{
		int num=6;
		int factorial=1;
		
		for(int i=1; i<=num;i++)
		{
			factorial=factorial*i;
		}
		System.out.println(factorial);
	}
}
