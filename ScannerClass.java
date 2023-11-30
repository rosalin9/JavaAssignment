package Assignment;
import java.util.Scanner;

public class ScannerClass 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int a,b;
		float x,y;
		double m,n;
		boolean z;
		
		System.out.println("Enter two integer numbers : ");
		a= input.nextInt();
		b= input.nextInt();
		System.out.println("{a} + {b} = "+ (a+b));
		
		System.out.println("Enter two floating numbers : ");
		x= input.nextFloat();
		y= input.nextFloat();
		System.out.println("{x} + {y} = "+ (x+y));
		
		System.out.println("Enter two double numbers : ");
		m= input.nextDouble();
		n= input.nextDouble();
		System.out.println("{m} + {n} = "+ (m+n));
		
		System.out.println("Enter a boolean value : ");
		z= input.nextBoolean();
		System.out.println("{z} = "+ z);

	}

}
