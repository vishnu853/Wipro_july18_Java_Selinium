package core_java;



public class ParameterizedMetods
{
	// normal method
	public void add()
	{
		int a=10;
		int b=20;
		int c=a+b;
		
		System.out.println(c);
		
	}
	
	// Method with parameters
	public void add1(int a, int b)
	{
		int c= a+b;
		System.out.println(c);
	}
	
	public static void main(String[] args) 
	{
	
		ParameterizedMetods pm= new ParameterizedMetods();
		pm.add();
		pm.add1(7, 9);
		pm.add1(-4, 9);
		pm.add1(-6, -11);
	
	}

}
