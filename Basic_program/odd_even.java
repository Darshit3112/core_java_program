package Basic_program;

import java.util.Scanner;

public class odd_even 
{
	public odd_even() 
	{
		System.out.println("enter number=");
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				System.out.println("\neven number="+i);
			}
			else
			{
				System.out.println("\nodd number="+i);
			}
		}
	}
	public static void main(String[] args) 
	{
		odd_even or=new odd_even();
	}
}
