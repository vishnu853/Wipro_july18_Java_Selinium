package package1;

public class class_01 
{
	private static String employeeSalary="89000";
	
	private void fetchsalary()
	{
		System.out.println("The employee salary is: "+employeeSalary);
	}
	public void display()
	{
		System.out.println("Displaying the data:");
	}
	
	// default
	int employeeId=77887;
	
	void fetchemployeeID()
	{
		System.out.println("The employee Id is: "+ employeeId);
	}
	
	// protected
	String employeename="vishnu";
	protected void employeename()
	{
		System.out.println("The Employee name is: "+employeename);
	}
	public static void main(String[] args)
	{
		class_01 obj = new class_01();
		
		obj.display();
		obj.fetchsalary();
		obj.fetchemployeeID();
		obj.employeename();
	}
}
