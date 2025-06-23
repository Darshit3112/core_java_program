package Basic_program;

public class array_parameter 
{
	int array_parameter(int arr[])
	{
		int max=0;
		for(int i=0;i<3;i++)
		{
		System.out.println(arr[i]);
		}
		
		for(int i=0;i<3;i++)
		{
			max=arr[0];
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		//System.out.print("max="+max);
		return max;
	}
	public static void main(String[] args) 
	{
		int arr[]= {1,2,3};
		array_parameter ap=new array_parameter();
		System.out.println(ap.array_parameter(arr));
		int ans=ap.array_parameter(arr);
		System.out.println(ans);
	}
}
