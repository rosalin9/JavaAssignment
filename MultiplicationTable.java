package Assignment;

import java.util.Scanner;

public class MultiplicationTable 
{

	public static void main(String[] args) 
	{
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter the number whose multiplication table to display: ");
		int n=obj.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println(n + "X" + i + " = " + n*i);
		}
		obj.close();

	}

}
