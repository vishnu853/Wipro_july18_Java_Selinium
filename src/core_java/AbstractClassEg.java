package core_java;

 abstract class AbstractClassEg1
{
	abstract void makesound();
	
	public void eat()
	{
		System.out.println("The Animal eats Food");
	}
	
	// Constructor
	
	AbstractClassEg1()
	{
		System.out.println("Creating Constructor in abstract class");
	}
	
	//instance variable
	public static String animalName="Lion";
	
	// final variable
	public final String animalBehaviour="roars";
	
}

 public class AbstractClassEg extends AbstractClassEg1
 {
	 void makesound()
	 {
		 System.out.println("Animal makes sound");
	 }
	 public static void main(String[] args) 
	 {
		 AbstractClassEg obj= new AbstractClassEg();
		 obj.eat();
		 obj.makesound();
		 System.out.println(animalName);
	}
 }
 
 