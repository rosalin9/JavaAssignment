package Assignment;
import java.util.Scanner;

public class Student 
{
	String name;
	int roll_no;
	String phone_no;
	String address;

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		Student s1 = new Student();
		System.out.print("Enter the student name : ");
		s1.name = input.nextLine();
		System.out.print("Enter the student address : ");
		s1.address = input.nextLine();
		System.out.print("Enter the student Roll number : ");
		s1.roll_no = Integer.parseInt(input.nextLine());
		System.out.print("Enter the student phone number : ");
		s1.phone_no = input.nextLine();
		
		
		Student s2 = new Student();
		System.out.print("Enter the student name : ");
		s2.name = input.nextLine();
		System.out.print("Enter the student address : ");
		s2.address = input.nextLine();
		System.out.print("Enter the student Roll number : ");
		s2.roll_no = Integer.parseInt(input.nextLine());
		System.out.print("Enter the student phone number : ");
		s2.phone_no = input.nextLine();
		
		input.close();
		//s1.name = "John";
		//s1.roll_no = 2;
		
		System.out.println("Student name : " + s1.name);
		System.out.println("Student roll number : " + s1.roll_no);
		System.out.println("Student phone number : " + s1.phone_no);
		System.out.println("Student address : " + s1.address +"\n");
		
		System.out.println("Student name : " + s2.name);
		System.out.println("Student roll number : " + s2.roll_no);
		System.out.println("Student phone number : " + s2.phone_no);
		System.out.println("Student address : " + s2.address);
		

	}

}
