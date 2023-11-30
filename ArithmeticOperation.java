package Assignment;
import java.util.Scanner;

public class ArithmeticOperation 
{

	static int Addition(int x, int y)
	{
		return x+y;
	}
	static int Subtract(int x, int y)
	{
		return x-y;
	}
	static int Multiply(int x, int y)
	{
		return x*y;
	}
	static int Division(int x, int y)
	{
		return x/y;
	}
	static int Modulus(int x, int y)
	{
		return x%y;
	}
	public static void main(String[] args) 
	{
		int a,b;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first number : ");
		a=input.nextInt();
		System.out.print("Enter second number : ");
		b=input.nextInt();
		
		System.out.println("{a} + {b} = "+ Addition(a,b));
		System.out.println("{a} - {b} = "+ Subtract(a,b));
		System.out.println("{a} * {b} = "+ Multiply(a,b));
		System.out.println("{a} / {b} = "+ Division(a,b));
		System.out.println("{a} % {b} = "+ Modulus(a,b));
		

	}

}
