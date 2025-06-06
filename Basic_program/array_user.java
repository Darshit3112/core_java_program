package Basic_program;

import java.util.Scanner;

public class array_user 
{
	
	public static void main(String[] args) 
	{
		int tot=0;
		double avg = 0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the array:");
		int size;
		size=sc.nextInt();
		int arr[]=new int[size];//create an array of integers with user define
		System.out.println("enter the elements of the array:");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();//taking input from user
		}
		//printing the elements of the array
		for(int i=0;i<size;i++)
		{
			System.out.println(arr[i]);
			tot=tot+arr[i];
			avg=tot/size;
		}
		System.out.println("total="+tot);
		System.out.println("avg="+avg);
		
	}
}
