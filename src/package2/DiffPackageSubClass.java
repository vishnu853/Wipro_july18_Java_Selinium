package package2;

import package1.class_01;

public class DiffPackageSubClass extends class_01
{
	public void create()
	{
		System.out.println("creating in sub class");
	}
	
	public static void main(String[] args)
	{
		DiffPackageSubClass obj=new DiffPackageSubClass();
		
		obj.create();
		obj.display();
		obj.employeename();
	}
}

	
