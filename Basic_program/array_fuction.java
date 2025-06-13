package Basic_program;

public class array_fuction 
{
	int sum=0,avg=0;
	public void display(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			//System.out.print(arr[i] + " ");
			sum=sum+arr[i];
			avg=sum/arr.length;
		}
		System.out.println("sum="+sum);
		System.out.println("avg="+avg);
	}
	public static void main(String[] args) 
	{
		array_fuction af= new array_fuction();
		int arr[]= {11,12,13,14};
		af.display(arr);
	}
}
