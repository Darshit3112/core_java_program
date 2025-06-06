package Basic_program;

public class array1 
{
	public static void main(String[] args) 
	{
		//store multiple elements of the same type in a single variable(datatype)
		int arr[]= {1,2,3,4,5}; //create array of integers with 5 elements
		//accessing elements of an array
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		int arr1[]=new int [5];//create an array of integers with 5 elements
		arr1[0]=10;
		arr1[1]=20;
		arr1[2]=30;
		arr1[3]=40;
		arr1[4]=50;
		//accessing elements of an array
		for(int i=0;i<arr1.length;i++)
		{
			System.out.println(arr1[i]);
		}
	}
}
