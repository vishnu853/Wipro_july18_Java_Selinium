package package2;

import package1.class_01;

public class DiffPackageNonSubClass
{
	public void print()
	{
		System.out.println("Printing the data");
	}
	
	public static void main(String[] args)
	{
		class_01 obj= new class_01();
		
		DiffPackageNonSubClass obj1=new DiffPackageNonSubClass();
		
		obj.display();
		obj1.print();
		//obj.employeename();
	}
}
