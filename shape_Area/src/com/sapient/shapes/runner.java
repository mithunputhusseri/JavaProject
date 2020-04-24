package com.sapient.shapes;

public class runner {
	
	public static void main(String[] args) {
		Shape new_shape = new Shape(3,12);
		Shape new_shape1 = new Shape(4,15);
		Shape new_shape2 = new Shape(5,15);
		new_shape.calculateShapeArea();
		new_shape1.calculateShapeArea();
		new_shape2.calculateShapeArea();
	}
}
