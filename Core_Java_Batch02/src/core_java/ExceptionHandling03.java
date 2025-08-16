package core_java;


public class ExceptionHandling03 
{
	public static void main(String[] args) throws Exception
	{
		int age=15;
		if(age < 18)
		{
			
			System.out.println(" Your are minor");
			
			throw new Exception("Age must be 18 or older ");
		}
		
		else 
		{
			System.out.println("Your are eligible");
		}
	}
}
