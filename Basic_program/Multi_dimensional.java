package Basic_program;

import java.util.Scanner;

public class Multi_dimensional 
{
	public Multi_dimensional() 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter num of row=");
		int row=scn.nextInt();
		System.out.println("enter num of column");
		int col=scn.nextInt();
		int arr[][] = new int [row][col];
		
		System.out.println("enter the element=");
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				arr[i][j]=scn.nextInt();
			}
		}
		System.out.println("your element");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		new Multi_dimensional();
	}
}
