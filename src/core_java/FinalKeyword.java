package core_java;

class Key
{
	int a=10;
	final int b=20;
	
	public void demo()
	{
		// b=30;
		
		System.out.println(b);
		
		System.out.println("Demo class1 executed ");
	}
	
	final public void hello()
	{
		System.out.println("Demo class1 executed ");
	}
}
class key2 extends Key
{
	public void demo()
	{
		System.out.println("Demo class2 executed ");
	}
	
//	public void hello()
//	{
//		System.out.println("Demo class2 executed ");
//	}
}
public class FinalKeyword 
{
	public static void main(String[] args) {
		
		key2 obj=new key2();
		obj.demo();
		
		
	}
}
