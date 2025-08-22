package core_java;

public class PrimeNumber
{
	public static boolean isPrime(int num)
	{
		for(int i=2; i<=num/2; i++)
		{
			if(num % i ==0)
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) 
	{
		int num=29;
		boolean res=isPrime(num);
		
	}
}
