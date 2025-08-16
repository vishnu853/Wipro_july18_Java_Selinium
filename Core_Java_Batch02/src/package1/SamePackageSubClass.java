package package1;

public class SamePackageSubClass extends class_01
{
	public void read()
	{
		System.out.println("Reading in sub class");
	}
	
	public static void main(String[] args) 
	{
		SamePackageSubClass obj=new SamePackageSubClass();
		obj.display();
		obj.read();
		obj.employeename();
	}
}



