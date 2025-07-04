package inheritance;

import java.util.Scanner;
public class array_test 
{
	public array_test()
	{
		int arr[]= new int[4];
		Scanner scn=new Scanner(System.in);
		for(int i=0;i<4;i++)
		{
			arr[i]=scn.nextInt();
		}
		for(int i=0;i<4;i++)
		{
		System.out.println(arr[i]);
		}
	}
	public static void main(String[] args) 
	{
		array_test at=new array_test();
	}
}
