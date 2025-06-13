package Basic_program;

import java.util.Scanner;

public class Array_prog 
{
	int n;
	public Array_prog()
	{
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter size of array");
		int n=scn.nextInt();
		
		int arr[]= new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("enter "+(i+1)+" elements");
			arr[i]=scn.nextInt();
		
		}
		for(int i=0;i<n;i++)
		{
			
			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args) 
	{
		new Array_prog();
	}
}
