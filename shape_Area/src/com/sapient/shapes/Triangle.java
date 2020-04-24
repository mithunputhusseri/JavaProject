package com.sapient.shapes;

public class Triangle {
	private int length;
	Triangle(int length)
	{
		this.length = length;
	}
	public void shapeArea() {
		System.out.println("The area of triangle is :" + (0.433*length*length));
	}

}
