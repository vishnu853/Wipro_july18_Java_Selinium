package LabSession_july_31;

public class Reverse 
{
	
	public static void main(String[] args) 
	{
		int n=1234567;
		int rev=0; 
		int rem;
		
		while(n !=0)
		{
			 rem=n % 10;
			 rev=rev*10+rem;
			 n = n/10;
		}
		System.out.println(rev);
	}{
		
	}
}
