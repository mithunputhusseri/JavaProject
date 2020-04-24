package com.sapient.problem2;

import java.util.Arrays;

public class Command_Line1 {
	private int[] array;
	private int sum =0;
	private double avg = 0;
	private int largest=0;
	private int smallest=0;

	public void setData(int[] array) {
		// TODO Auto-generated method stub
		this.array = array;
	}

	public void calData() {
		// TODO Auto-generated method stub
		Arrays.sort(array);
		int s = 0;
		for(int i=0;i< array.length; i++)
		{
			s = s + array[i];
		}
		sum = s;
		avg = s/array.length;
		largest = array[array.length-1];
		smallest = array[0];
	}

	public void displayData() {
		System.out.println("Sum of numbers is: " + sum);
		System.out.println("Average of numbers is: " + avg);
		System.out.println("Largest of numbers is: " + largest);
		System.out.println("Smallest of numbers is: " + smallest);
		// TODO Auto-generated method stub
		
	}
	

}
