package Assignment;

public class MaxMinArray 
{
	static int MaxArray(int[] arr)
	{
		int max=arr[0];
		for(int i=1; i < arr.length; i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		return max;
	}
	
	static int MinArray(int[] arr)
	{
		int min=arr[0];
		for(int i=1; i < arr.length; i++)
		{
			if(min>arr[i])
			{
				min=arr[i];
			}
		}
		return min;
	}

	public static void main(String[] args) 
	{
		int[] Arr = {60,30,40,70,20,10,30};
		
		System.out.println("Maximum value of array is : " + MaxArray(Arr));
		
		System.out.println("Minimum value of array is : " + MinArray(Arr));

	}

}
