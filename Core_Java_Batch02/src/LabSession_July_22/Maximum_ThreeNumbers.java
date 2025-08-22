package LabSession_July_22;

public class Maximum_ThreeNumbers 
{
	public static void main(String[] args)
	{
		int a=12;
		int b=5;
		int c=8;
		int max;
		
		
		if( a>=b && a>=c)
		{
			max=a;
		}
		
		else if(b>=a && b>=c)
		{
			max=b;
		}
		
		else
		{
			max=c;
		}
		System.out.println("The maximun number is "+max);
	}
}
