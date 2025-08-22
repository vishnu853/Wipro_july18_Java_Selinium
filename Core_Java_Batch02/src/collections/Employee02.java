package collections;

public class Employee02 
{
	int id;
	String name;
	int salary;
	
	Employee02(int id, String name)
	{
		this.id=id;
		this.name=name;
		
		
	}
	
	public String toString()
	{
		return id +"_" +name;
	}
}
