package LabSession_July_25;


interface Animal
{
	abstract void bark();
}

class Dog implements Animal
{
	
	public void bark() {
		
		System.out.println("Dog barks");
	}
}
public class Interface02

{
	public static void main(String[] args)
	{
		Dog obj= new Dog();
		obj.bark();
	}
}
