package Assignment;
import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) 
	{
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int a = obj.nextInt();
		System.out.print("Enter second number: ");
		int b = obj.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a = " + a + " b = " + b);
		obj.close();
	
	}

}
