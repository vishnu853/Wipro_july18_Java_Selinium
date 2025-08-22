package LabSession_July_24;

abstract class Shape {
	
    // Abstract method 
    public abstract double calculateArea();
}

// Circle class (subclass of Shape)
class Circle extends Shape {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}


class Rectangle extends Shape {
    private double length;
    private double width;

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    
    public double calculateArea() {
        return length * width;
    }
}


public class ShapeDemo {
    public static void main(String[] args) 
    {
        
        Shape circle = new Circle(2.5);
        Shape rectangle = new Rectangle(4.0, 3.0);

        // Print area of each
        System.out.println("Area of Circle: " + circle.calculateArea());
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
    }
}