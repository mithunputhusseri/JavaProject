package com.sapient.shapes;

public class Square {
	private int length;
	Square(int length)
	{
		this.length = length;
	}
	public void shapeArea() {
		System.out.println("The area of Square is :" + (length*length));
	}
}
