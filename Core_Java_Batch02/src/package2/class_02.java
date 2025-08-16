package package2;

import package1.class_01;

public class class_02 
{
	public void print()
	{
		System.out.println("Printing the data");
	}
	
	public static void main(String[] args)
	{
		class_01 obj=new class_01();
		class_02 obj1=new class_02();
		
		obj.display();
		obj1.print();
	}
}
