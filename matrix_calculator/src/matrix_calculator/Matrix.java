package matrix_calculator;

import java.util.Scanner;

public class Matrix {
	int n;
	int m[][];
	Scanner s = new Scanner(System.in);
	Matrix(){
		n =3;
		m = new int[n][n];
	}
	Matrix(int n)
	{
		this.n = n;
		m = new int [n][n];
	}
	public void read() {
		// TODO Auto-generated method stub
        


        System.out.println("Enter all the elements:");

        for(int i = 0; i < n; i++)

        {
        	for(int j =0;j<n;j++)
            m[i][j] = s.nextInt();

        }
	}
	public void read(int m[][]) {
		this.m = m;
	}
	public void display() {
		// TODO Auto-generated method stub
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
				System.out.print(m[i][j] + " ");
			System.out.println(" ");
		}
	}
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("Enter another matrix of same size: ");
		int[][] m1 = new int[n][n];
        for(int i = 0; i < n; i++)

        {
        	for(int j =0;j<n;j++)
            m1[i][j] = s.nextInt();

        }
        for(int i =0;i<n;i++)
        {
        	for(int j=0;j<n;j++)
        		m1[i][j] = m1[i][j] + m[i][j];
        }
        System.out.println("Resultant matrix after addition is: ");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
				System.out.print(m1[i][j] + " ");
			System.out.println(" ");
		}
	}
	public void checkScalar() {
		// TODO Auto-generated method stub
		   for (int i = 0; i < n; i++) 
		        for (int j = 0; j < n; j++) 
		            if ((i != j) && (m[i][j] != 0)) 
		            {
		            	System.out.println("Matrix is not scalar");
		            	return;
		            }
		  
		    // Check all diagonal elements are same or not. 
		    for (int i = 0; i < n - 1; i++) 
		        if (m[i][i] != m[i + 1][i + 1]) 
		        {
		        	System.out.println("Matrix is not scalar");
	            	return;
		        }
		    System.out.println("Matrix is scalar");
		    return;
	}
	public void multiply() {
		// TODO Auto-generated method stub
		System.out.println("Enter another matrix: ");
		int[][] m1 = new int[n][n];
		int[][] res = new int[n][n];
        for(int i = 0; i < n; i++)

        {
        	for(int j =0;j<n;j++)
            m1[i][j] = s.nextInt();
        	
        }
        for (int i = 0; i < n; i++) 
        { 
            for (int j = 0; j < n; j++) 
            { 
                res[i][j] = 0; 
                for (int k = 0; k < n; k++) 
                    res[i][j] += m[i][k]  
                                * m1[k][j]; 
            } 
        }
        System.out.println("Resultant matrix after multiplication is:");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
				System.out.print(res[i][j] + " ");
			System.out.println(" ");
		}
	}
	

}
