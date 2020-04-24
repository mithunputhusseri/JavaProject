package com.sapient.shapes;

public class Circle {
	private int radius;
	Circle(int radius)
	{
		this.radius = radius;
	}
	public void shapeArea() {
		System.out.println("The area of circle is :" + (3.14*radius*radius));
	}
}
