package core_java;

public class Garbagecollection 
{
	public void finalize()
	{
		System.out.println("object is garbage collected");
	}
	public static void main(String[] args) 
	{
		Garbagecollection obj=new Garbagecollection();
		obj=null;
		
		Garbagecollection obj1=new Garbagecollection();
		Garbagecollection obj2=new Garbagecollection();
		
		obj1=obj2;
		
		Garbagecollection obj3=new Garbagecollection();
		
		Runtime.getRuntime().gc();
	}
}
