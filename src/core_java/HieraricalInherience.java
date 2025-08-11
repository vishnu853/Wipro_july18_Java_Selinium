package core_java;

class Animal
{
	public void eat()
	{
		System.out.println("Animals eat food");
	}
}

class Dog extends Animal
{
	public void bark()
	{
		System.out.println("Dog barks");
	}
}

class cat extends Animal
{
	public void meow()
	{
		System.out.println("Cat meow");
	}
}

class cow extends Animal
{
	public void shout()
	{
		System.out.println(" cow shouts");
	}
}
public class HieraricalInherience
{
	public static void main(String[] args)
	{
		Animal obj1=new Animal();
		obj1.eat();
		
		Dog obj2=new Dog();
		obj2.eat();
		obj2.bark();
		
		cat obj3=new cat();
		obj3.eat();
		obj3.meow();
		
		cow obj4=new cow();
		obj4.eat();
		obj4.shout();
		
	}
}
