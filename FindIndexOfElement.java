package Assignment;

public class FindIndexOfElement 
{
	static void FindIndex(int[] Arr, int k)
	{
		int count=0;
		int pos=0;
		for(int i=0; i< Arr.length; i++)
		{
			if(Arr[i]==k)
			{
				count++;
				pos=i;
			}
		}
		if(count > 0)
		{
			System.out.println("Element Found at Index position " + pos);
		}
		else
		{
			System.out.println("Element Not Found");
		}
	}

	public static void main(String[] args) 
	{
		int[] arr= {70,20,30,80,10,70,50};
		int key = 30;
		FindIndex(arr,key);

	}
}
