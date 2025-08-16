package package1;


public class SamepackageNonSubClass
{
	public void write() 
	{
		System.out.println("Writing in sub class");
	}
	public static void main(String[] args) 
	{
		class_01 obj=new class_01();
		
		SamepackageNonSubClass obj1=new SamepackageNonSubClass();
		obj1.write();
		obj.display();
		obj.employeename();
	}
}
