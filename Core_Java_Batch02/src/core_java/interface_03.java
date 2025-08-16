package core_java;

interface int_01
{
	abstract void hello();
}

interface int_02 extends int_01
{
	abstract void show();
}

//sub class

public class interface_03  implements int_02
{
	
	public void hello()
	{
		System.out.println("Hello method");
	}
	
	public void show()
	{
		System.out.println("Show method");
	}
	public static void main(String[] args)
	{
		interface_03 obj=new interface_03();
		obj.hello();
		obj.show();
	}
}
