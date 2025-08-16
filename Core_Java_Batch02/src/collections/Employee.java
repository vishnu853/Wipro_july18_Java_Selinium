package collections;


public class Employee 
{
	int id;
	String name;
	int salary;
	
	Employee(int id, String name)
	{
		this.id=id;
		this.name=name;
		
		
	}
	
	public String toString()
	{
		return id +"_" +name;
	}
}
