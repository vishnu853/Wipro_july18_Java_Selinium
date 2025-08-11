package core_java;

class A4
{
	public int add1(int a, int b)
	{
		int c=a+b;
		return c;
	}
	
	public int add1(int a, int b, int c)
	{
		int d=a+b+c;
		return d;
	}
	
	public int add1(int a, int b,int c,int d)
	{
		int e=a+b+c+d;
		return e;
	}
	
}
public class MethodOverloading
{
	public static void main(String[] args)
	{
		A4 obj= new A4();
		
		System.out.println(obj.add1(10,20));
		System.out.println(obj.add1(3,2));
		System.out.println(obj.add1(3,2));
	}
}
