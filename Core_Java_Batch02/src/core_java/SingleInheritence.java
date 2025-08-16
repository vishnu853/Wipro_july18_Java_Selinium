package core_java;


class A
{
	String brand="ford";
	
	public void start()
	{
		System.out.println("Vehicle is starting");
	}
	
}

class B extends A
{
	String model="Mustang";
	
	public void display()
	{
		System.out.println("Brand is "+ brand);
		System.out.println("Model is "+ model);
	}
}
public class SingleInheritence
{
	public static void main(String[] args) 
	{
		A obj1=new A();
		obj1.start();
		
		B obj2 = new B();
		obj2.display();
	}
	
	
}
