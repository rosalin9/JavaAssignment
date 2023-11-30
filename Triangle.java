package Assignment;

public class Triangle 
{
	int a,b,c;
	
	public Triangle()
	{
		a=3;
		b=4;
		c=5;
	}
	
	public void Perimeter()
	{
		int peri = a+b+c;
		System.out.println("Perimeter of triangle is: " + peri);
	}
	
	public void Area()
	{
		float s =(a+b+c)/2;
		double area = Math.sqrt(s * (s-a) *(s-b) *(s-c));
		System.out.println("Perimeter of triangle is: " + area);
	}

	public static void main(String[] args) 
	{
		Triangle obj = new Triangle();
		obj.Area();
		obj.Perimeter();
		
	}

	

}
