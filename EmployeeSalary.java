package Assignment;
import java.util.Scanner;

public class EmployeeSalary 
{

	public static void main(String[] args) 
	{
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter employee old salary: ");
		int OldSalary = obj.nextInt();
		System.out.print("Enter employee experience: ");
		int Exp = obj.nextInt();
		System.out.print("Enter how many rewards employee received: ");
		int reward = obj.nextInt();
		double NewSalary;
		if(Exp>=3 && Exp<=5)
		{
			NewSalary= OldSalary + (OldSalary * 0.1)+ (1000 * reward);
		}
		else if(Exp>=6 && Exp <=9)
		{
			NewSalary= OldSalary + (OldSalary * 0.15)+(1000 * reward);
		}
		else if(Exp>=10 && Exp <=20)
		{
			NewSalary= OldSalary + (OldSalary * 0.2)+(1000 * reward);
		}
		else
		{
			NewSalary= OldSalary + (OldSalary * 0.25)+(1000 * reward);
		}
		System.out.println("Revised salary of employee is : " + NewSalary);
		
		obj.close();

	}

}
