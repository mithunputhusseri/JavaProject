package com.sapient.problem2;

import java.util.Arrays;
import java.util.Scanner;

public class KeyRead_Line2 {
	private int[] a;
	private int n;

	public void read() {
		// TODO Auto-generated method stub
        int n;

        Scanner s = new Scanner(System.in);

        System.out.print("Enter no. of elements you want in array:");

        n = s.nextInt();

        int a[] = new int[n];

        System.out.println("Enter all the elements:");

        for(int i = 0; i < n; i++)

        {

            a[i] = s.nextInt();

        }
        this.a = a;
        this.n = n;

	}

	public void display() {
		// TODO Auto-generated method stub
		System.out.print("The array is: ");
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i] + " ");
		}
		System.out.println(" ");
	}

	public void sort() {
		// TODO Auto-generated method stub
		Arrays.sort(a);
	}

	public void find(int f) {
		// TODO Auto-generated method stub
		for(int i=0;i<n;i++)
		{
			if(a[i] == f)
			{
				System.out.println("Number found");
				return;
			}
		}
		System.out.println("Number not found");
	}

}
