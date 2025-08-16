package core_java;

public class MetthodsAndData
{

	public	String employeeName="Peter";
	int empid=67879;
	public static String employeeBU="HR";
	
	public void fetchemployeedetails()
	{
		String employeeLoc="knl";
		
		System.out.println(employeeLoc);
		System.out.println( employeeName);
		System.out.println(empid);
		System.out.println(employeeBU);
	}
	
	public static void main(String[] args)
	{
	    
		MetthodsAndData obj =new MetthodsAndData();
		obj.fetchemployeedetails();
		
	}

}
