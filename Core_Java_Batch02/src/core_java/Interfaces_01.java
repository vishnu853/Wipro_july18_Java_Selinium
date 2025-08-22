package core_java;

public class Interfaces_01 implements Interface01
{
	public void display()
	{
		System.out.println("Displaying in a child class");
	}
	
	public static void main(String[] args) 
	{
		Interfaces_01 obj=new Interfaces_01();
		obj.show();
		obj.display();
		
		
		System.out.println(employeename);
		System.out.println(employeeId);
	}
}
