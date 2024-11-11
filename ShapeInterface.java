package core_java;

//declare interface Shape
interface Shape {
	double getArea();
}

class Rectangle implements Shape {
	
	private double length;
	private double width;	
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	//implementation of getArea() method
	@Override
	public double getArea() {	
		//calculate area of Rectangle
		return length * width;
	}
	
}

class Circle implements Shape {

	private double radius;
	
	public Circle(double radius) {
	  this.radius = radius;
	}
	//implementation of getArea() method
	@Override
	public double getArea() {
		//calculate area of Circle 
		return Math.PI * radius * radius;
	}
	
}

class Triangle implements Shape {
	private double base;
	private double height;
	
	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}

	//implementation of getArea() method
	@Override
	public double getArea() {
		//calculate area of Triangle
		return 0.5 * base * height;
	}
}

public class ShapeInterface {

	public static void main(String[] args) {
	   //create instance of Rectangle,Circle , and Triangle
		Rectangle r = new Rectangle(10, 5);
		Circle c = new Circle(7);
		Triangle t = new Triangle(6, 8);
		
		// Display the area of each shape
		System.out.println("Area of Rectangle: " + r.getArea());
		System.out.println("Area of Circle: " + c.getArea());
		System.out.println("Area of Triangle: " + t.getArea());
		

	}

}


//Output :-

/*
Area of Rectangle: 50.0
Area of Circle: 153.93804002589985
Area of Triangle: 24.0
*/