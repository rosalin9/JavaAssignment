package Assignment;
import java.util.Arrays;

public class SortArray 
{
	
	//Bubble Sort
	static void SortInteger(int[] Arr)
	{
		int temp;
		
		//Loop for each iteration
		for(int i=0;i<Arr.length -1; i++)
		{
			//Loop for checking and sorting the elements
			for(int j=0; j<Arr.length-i-1; j++)
			{
				if(Arr[j]>Arr[j+1])
				{
					temp=Arr[j];
					Arr[j]=Arr[j+1];
					Arr[j+1] = temp;
				}
			}
		}
		System.out.println("Sorted Array" + Arrays.toString(Arr));
	 }
	
	static void SortString(String[] sArr)
	{
		int size=sArr.length;
		String temp;
		//Loop for each iteration
		for(int i=0;i<size -1; i++)
		{
			//Loop for checking and sorting the elements
			for(int j=i+1; j<size; j++)
			{
				if(sArr[i].compareTo(sArr[j])>0)
				{
					temp=sArr[i];
					sArr[i]=sArr[j];
					sArr[j] = temp;
				}
			}
		}
		System.out.println("Sorted Array" + Arrays.toString(sArr));
	}

	public static void main(String[] args) 
	{
		int[] arr = {4,2,6,8,3,7,1};
		String[] Sarr = {"Java","Oracle","Automation","Testing","SQL"};
		
		System.out.println("Before sorting the Array" + Arrays.toString(arr));
		SortInteger(arr);
		
		System.out.println("Before sorting the Array" + Arrays.toString(Sarr));
		SortString(Sarr);
		
		//Another way of sorting using in-built sort method
		//Arrays.sort(Sarr);
		//System.out.println("After sorting the Array" + Arrays.toString(Sarr));

	}

}
