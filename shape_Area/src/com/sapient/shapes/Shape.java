package com.sapient.shapes;

public class Shape {
	private int sides;
	private int length;
	Shape(int sides,int length)
	{
		this.sides = sides;
		this.length = length;
	}
	public void calculateShapeArea()
	{
		if(sides == 1)
		{
			Circle c1 = new Circle(length);
			c1.shapeArea();
		}
		else if(sides == 3)
		{
			Triangle t1 = new Triangle(length);
			t1.shapeArea();
		}
		else if(sides == 4)
		{
			Square s1 = new Square(length);
			s1.shapeArea();
		}
		else
		{
			System.out.println("No shapes present");
		}
	}

}
