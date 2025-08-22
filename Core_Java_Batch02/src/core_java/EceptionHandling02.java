package core_java;

public class EceptionHandling02 
{
	public static void main(String[] args) 
	{
		try
		{

			String s1= null;
			System.out.println(s1.length());
		}
		
		
		catch (NullPointerException np)
		{
			System.out.println(np);		
		}
	}

}
