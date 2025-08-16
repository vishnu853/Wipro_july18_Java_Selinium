package LabSession_July_25;

interface Shape
{
	double getArea();
}

// Rectangular Class
class  Rectangle implements Shape
{
	private double length,width;
	
	public Rectangle(double length, double width)
	{
		this.length=length;
		this.width=width;
	}

	public double getArea() 
	{
		return length * width;
	}	
}

// Circle class
class Circle implements Shape
{
	private double radius;
	
    //	Constructor
	 Circle(double radius) 
	 {
		this.radius=radius;
	 }
	 
	 public double getArea()
	 {
		 return Math.PI * radius * radius;
	 }
}

class Triangle implements Shape
{
	private double base,height;
	
	public Triangle( double base, double height)
	{
		this.base=base;
		this.height=height;
	}
	
	public double getArea()
	 {
		 return 0.5 * base* height;
	 }
}
public class Interface01 
{
	public static void main(String[] args) 
	{
		Rectangle obj1=new Rectangle(10, 12);
		System.out.println(obj1.getArea());
		
		Circle obj2 = new Circle(9);
		System.out.println(obj2.getArea());
		
		Triangle obj3= new Triangle(13, 14);
		System.out.println(obj3.getArea());
	}
}
