package core_java;

public class EncapsulationEx
{
	private String name;
	private int age;
	
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	
	public static void main(String[] args)
	{
		EncapsulationEx obj=new EncapsulationEx();
		
		obj.setName("Vishnu");
		obj.setAge(23);
		
		System.out.println(obj.getName());
		System.out.println(obj.getAge());
	}
	
}
