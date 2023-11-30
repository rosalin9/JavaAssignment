package Assignment;

public class Rectangle 
{
	int length;
	int breadth;
	
	public Rectangle(int len, int bred)
	{
		length=len;
		breadth=bred;
	}
	public int Area()
	{
		return length*breadth;
	}

	public int Perimeter()
	{
		return 2*(length+breadth);
	}
	

	public static void main(String[] args) 
	{
		Rectangle r1 = new Rectangle(4,5);
		System.out.println("Area of Rectangle is : " + r1.Area());
		System.out.println("Perimeter of Rectangle is: " + r1.Perimeter());
		
		Rectangle r2 = new Rectangle(5,8);
		System.out.println("Area of Rectangle is : " + r2.Area());
		System.out.println("Perimeter of rectangle is: " + r2.Perimeter());
		

	}

}
