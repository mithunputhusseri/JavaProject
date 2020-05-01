import java.util.Scanner;

public class Test {
	
	interface Num_Process
	{
		double call(int x,int y);
	}

	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		Num_Process add = (int x,int y)-> x+y;
		Num_Process sub = (int x,int y)-> x-y;
		Num_Process multiply = (int x,int y)-> x*y;
		Num_Process divide = (int x,int y)-> x/y;
		int x;int y; int fun; 
		System.out.println("Enter First number: ");
		x = s.nextInt();
		System.out.println("Enter second number: ");
		y = s.nextInt();
		System.out.println("Enter function");
		System.out.println("1.add  2.sub  3.mul  4.div");
		fun = s.nextInt();
		if(fun ==1) System.out.println("additon  " + add.call(x,y));
		else if(fun ==2) System.out.println("substraction  " + sub.call(x,y));
		else if(fun ==3) System.out.println("multiply  " + multiply.call(x,y));
		else if(fun ==4) System.out.println("divide  " + divide.call(x,y));
		else System.out.println("Invalid function");
		
	}
}
