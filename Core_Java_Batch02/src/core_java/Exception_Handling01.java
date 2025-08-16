package core_java;

public class Exception_Handling01 
{
	public static void main(String[] args)
	{
		
		try
		{
			int a=10;
			int b=0;
			int c=a/b;		
			System.out.println(c);
		}
		
		catch (ArithmeticException ae)
		{
			System.out.println("Division with 0 not possible");		
		}
	}
}
