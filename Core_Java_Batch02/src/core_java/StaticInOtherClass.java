package core_java;

public class StaticInOtherClass 
{
	public static void main(String[] args)
	{
		System.out.println(StaticVariables.studentName);
		System.out.println(StaticVariables.StudId);
		
		StaticVariables sv= new StaticVariables();
		System.out.println(sv.CollegeName);
	}
}
