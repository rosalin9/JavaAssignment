package Assignment;

public class AvverageOfArray 
{

	public static void main(String[] args) 
	{
		int[] Arr = {30,20,50,10,70,60};
		int sum = 0;
		int n = Arr.length;
		
		for(int i=0; i < n; i++)
		{
			sum += Arr[i];
		}
		
		System.out.println("The average of an array = "+ (sum/n));

	}

}
