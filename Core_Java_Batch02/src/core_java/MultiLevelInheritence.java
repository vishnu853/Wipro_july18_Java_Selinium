package core_java;

class A1
{
	String brand="ford";
	
	public void start()
	{
		System.out.println("Vehicle is starting");
	}
	
}

class B1 extends A1
{
	
	public void started()
	{
		System.out.println("Vehicle is Started");
	}
	
}

class C1 extends B1
{
	
	public void stop()
	{
		System.out.println("Vehicle is stopped");
	}
}
 


public class MultiLevelInheritence
{
	public static void main(String[] args)
	{
		A1 obj1=new A1();
		obj1.start();
		
		B1 obj2 = new B1();
		obj2.started();
		
		C1 obj3=new C1();
		obj3.stop();
	}
}
