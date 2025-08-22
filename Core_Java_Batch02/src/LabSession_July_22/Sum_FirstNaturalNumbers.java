package LabSession_July_22;

public class Sum_FirstNaturalNumbers
{
	public static void main(String[] args) 
	{
		int n=10;
		int sum=0;
		
		for(int i=1; i<=n;i++)
		{
			sum=sum+i;
			
		}
		System.out.println("The sum of first 10 natural numbers: "+ sum);
	}
}
