package Assignment;

public class Circle {

	int radius;
	final double Pi = 3.14; 
	
	public Circle(int r)
	{
		radius = r;
	}
	public double Area()
	{
		return Pi * radius * radius;
	}

	public double Perimeter()
	{
		return 2 * Pi * radius ;
	}
	

	public static void main(String[] args) 
	{
		Circle c = new Circle(4);
		
		System.out.println("Area of Circle is : " + c.Area());
		System.out.println("Perimeter of Circle is: " + c.Perimeter());
		
		
	}

}
