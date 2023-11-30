package Assignment;

public class SearchElementInArray 
{
	
	static void SearchArray(int[] Arr, int k)
	{
		int count=0;
		for(int i=0; i< Arr.length; i++)
		{
			if(Arr[i]==k)
			{
				count++;
			}
		}
		if(count > 0)
		{
			System.out.println("Element Found");
		}
		else
		{
			System.out.println("Element Not Found");
		}
	}

	public static void main(String[] args) 
	{
		int[] arr= {70,20,30,80,10,70,50};
		int key = 40;
		SearchArray(arr,key);

	}

}
