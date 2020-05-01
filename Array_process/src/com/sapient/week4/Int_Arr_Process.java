package com.sapient.week4;

import java.util.Arrays;
import java.util.Scanner;

public class Int_Arr_Process {
	int[] a;
	int n;
	Int_Arr_Process()
	{
		n = 10;
		a = new int[5];
	}
	Int_Arr_Process(int n)
	{
		this.n = n;
		a = new int[n];
	}
	public void create() {
		// TODO Auto-generated method stub

	        Scanner s = new Scanner(System.in);

	        int a[] = new int[n];

	        System.out.println("Enter all the elements:");

	        for(int i = 0; i < n; i++)

	        {

	            a[i] = s.nextInt();

	        }
	        this.a = a;
	}
	public void create(int[] a)
	{
		this.a = a;
	}
	public void print_vertical() {
		// TODO Auto-generated method stub
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i] + " ");
		}
		System.out.println(" ");
	}
	public void print_horizontal() {
		// TODO Auto-generated method stub
		for(int i =0;i<n;i++)
		{
			System.out.println(a[i]);
		}
	}
	public void sort() {
		// TODO Auto-generated method stub
		Arrays.sort(a);
	}
	public void find_largest() {
		// TODO Auto-generated method stub
		Arrays.sort(a);
		System.out.println("Largest number is: " + a[n-1]);
	}
	public void find_smallest() {
		// TODO Auto-generated method stub
		Arrays.sort(a);
		System.out.println("Smallest number is: " + a[0]);
	}
	public void find_secondlargest() {
		// TODO Auto-generated method stub
		int j = a[n-1];
		int i = n-1;
		while(j == a[i])
		{
			i = i-1;
		}
		System.out.println("Second largest number is: " + a[i]);
	}

}
