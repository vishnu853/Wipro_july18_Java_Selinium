package LabSession_July_25;

public class Encapsulation_01 
{
	private int id;
	private String name;
	private int salary;
	
	public int getId() 
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public int getSalary()
	{
		return salary;
	}
	public void setSalary(int salary)
	{
		this.salary = salary;
	}
	
	
	public static void main(String[] args)
	{
		Encapsulation_01 obj=new Encapsulation_01();
		obj.setId(102);
		obj.setName("Sai");
		obj.setSalary(20000);
		
		System.out.println("ID: "+obj.getId());
		System.out.println("Name: "+obj.getName());
		System.out.println("Salary: "+obj.getSalary());
	}
}
