package Assignment;
import java.util.Scanner;

public class Average 
{
	int a,b,c;
	
	public void Sum_Avg()
	{
		int sum= a+b+c;
		float result = sum/3;
		System.out.println("Sum of 3 numbers is : "+ sum);
		System.out.println("Average of 3 numbers is : "+ result);
	}

	public static void main(String[] args) 
	{
		Scanner input= new Scanner(System.in);
		
		Average obj = new Average();
		System.out.print("Enter the first number : ");
		obj.a = input.nextInt();
		System.out.print("Enter the second number : ");
		obj.b = input.nextInt();
		System.out.print("Enter the third number : ");
		obj.c = input.nextInt();
		
		obj.Sum_Avg();
		input.close();

	}

}
