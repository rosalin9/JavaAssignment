package Assignment;
import java.util.Arrays;

public class InsertElement 
{

	public static void main(String[] args) 
	{
		int[] arr = {1,2,4,5,6};
		int n= arr.length;
		int arr_new[] = new int[n+1];
		int pos =3;
		int k=3;
		for(int i=0; i<n+1; i++)
		{
			if(i<pos-1)
			{
				arr_new[i]=arr[i];
			}
			else if(i == pos-1)
			{
				arr_new[i]=k;
			}
			else
			{
				arr_new[i]=arr[i-1];
			}
				
		}
		System.out.println("Before insertion"+ Arrays.toString(arr));
		System.out.println("After insertion"+ Arrays.toString(arr_new));

	}

}
