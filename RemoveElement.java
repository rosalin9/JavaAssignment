package Assignment;

import java.util.Arrays;

public class RemoveElement {

	public static void main(String[] args) 
	{
		int[] arr = {1,2,3,4,5};
		int[] arr_new = new int[arr.length-1];
		
		int k=3;
		for(int i=0, j=0; i<arr.length; i++)
		{
			if(arr[i]!=k)
			{
				arr_new[j]=arr[i];
				j++;
			}
				
		}
		System.out.println("Before deletion"+ Arrays.toString(arr));
		System.out.println("After deletion"+ Arrays.toString(arr_new));

	}

}
