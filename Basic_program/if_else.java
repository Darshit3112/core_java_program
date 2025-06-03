package Basic_program;

import java.util.Scanner;

public class if_else 
{
	public if_else() 
	{
		System.out.println("enter 1st number=");
		Scanner scn=new Scanner(System.in);
		int a=scn.nextInt();
		System.out.println("enter 2nd number=");
		int b=scn.nextInt();
		System.out.println("enter 3rd number=");
		int c=scn.nextInt();
		if(a>=b && a>=c)
		{
			System.out.println(a+" is max");
		}
		else if(b>=c)
		{
			System.out.println(b+" is max");
		}
		else
		{
			System.out.println(c+" is max");
		}
	}
	public static void main(String[] args) 
	{
		if_else ie=new if_else();
	}
}
