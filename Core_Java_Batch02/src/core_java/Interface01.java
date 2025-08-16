package core_java;

public interface Interface01
{
	abstract void display();
	
	static void write()
	{
		System.out.println("Writing in Interface");
	}
	
	default void show()
	{
		System.out.println("Show class");
	}
	
	public static final String employeename="Jaya";
	
	int employeeId=6767;
}
