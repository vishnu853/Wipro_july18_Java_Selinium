package core_java;

public class StaticVariables 
{
	public static String studentName="Vijay";
	public String CollegeName="AP University";
	public static int StudId =121;
	
	public static void main(String[] args)
	{
		StaticVariables sv= new StaticVariables();
		
		// Acessing the static variables
		
		System.out.println(studentName);
		System.out.println(StudId);
		
		// Acessing the  non-static variables
		
		System.out.println(sv.CollegeName);
	}

}
