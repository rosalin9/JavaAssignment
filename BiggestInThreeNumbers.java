package Assignment;

import java.util.Scanner;

public class BiggestInThreeNumbers 
{

	public static void main(String[] args) 
	{
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int a=obj.nextInt();
		System.out.print("Enter the second number: ");
		int b=obj.nextInt();
		System.out.print("Enter the third number: ");
		int c=obj.nextInt();
		int FirstBig, SecondBig, ThirdBig;
		if(a>b && a>c)
		{
			FirstBig=a;
			if(b>c)
			{
				SecondBig=b;
				ThirdBig=c;
			}
			else
			{
				SecondBig=c;
				ThirdBig=b;
			}
		}
		else if(b>a && b>c)
		{
			FirstBig =b;
			if(a>c)
			{
				SecondBig=a;
				ThirdBig=c;
			}
			else
			{
				SecondBig=c;
				ThirdBig=a;
			}
		}
		else
		{
			FirstBig=c;
			if(a>b)
			{
				SecondBig=a;
				ThirdBig=b;
			}
			else
			{
				SecondBig=b;
				ThirdBig=a;
			}
		}
		System.out.println("First Big Number is: " + FirstBig);
		System.out.println("Second Big Number is: " + SecondBig);
		System.out.println("Third Big Number is: " + ThirdBig);
		obj.close();
	}

}
