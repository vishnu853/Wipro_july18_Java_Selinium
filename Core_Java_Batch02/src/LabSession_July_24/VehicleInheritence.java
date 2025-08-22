package LabSession_July_24;

abstract class vehicle
{
	abstract void move();
}

 class Car extends vehicle
{
	public void move()
	{
		System.out.println("Car is moving on four wheels");
	}
}

class Bus extends vehicle
{
	public void move()
	{
		System.out.println("Bus is moving on 4 wheels");
	}
}

class Bike extends vehicle
{
	public void move()
	{
		System.out.println("Bike is moving on 2 wheels");
	}
}


public class VehicleInheritence
{
	public static void main(String[] args)
	{
		Car obj1=new Car();
		obj1.move();
		
		Bus obj2=new Bus();
		obj2.move();
		
		Bike obj3=new Bike();
		obj3.move();
		
	}
}
