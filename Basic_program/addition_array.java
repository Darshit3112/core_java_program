package Basic_program;

import java.util.Scanner;

public class addition_array 
{
	public addition_array() 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter num of row=");
		int row=scn.nextInt();
		System.out.println("enter num of column");
		int col=scn.nextInt();
		int arr1[][] = new int [row][col];
		int arr2[][] = new int [row][col];
		int sum[][] = new int [row][col];
		
		System.out.println("enter the 1st array element=");
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				arr1[i][j]=scn.nextInt();
			}
		}
		
		System.out.println("enter the 2nd array element=");
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				arr2[i][j]=scn.nextInt();
			}
		}
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				sum[i][j]=arr1[i][j]+arr2[i][j];
				System.out.print(sum[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		new addition_array();
	}
}
