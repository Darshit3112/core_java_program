package Basic_program;

public class max_array 
{
	public max_array() 
	{
		 int arr[]= {1,2,3,4,5};
		 int max=arr[0];
		 for(int i=0;i<arr.length;i++)
		 {
			 if(arr[i]>max)
			 {
				 max=arr[i];
			 }
		 }
		 System.out.println(max+" is max");
	}
	public static void main(String[] args) 
	{
		new max_array();
	}
}
