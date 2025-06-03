package Basic_program;

import java.util.Scanner;

public class parameter_constructor 
{
	public parameter_constructor(int i)
	{
		System.out.println(i);
	}
	parameter_constructor(String s)
	{
		System.out.println(s);
	}
	parameter_constructor(double d) 
	{
		System.out.println(d);
	}
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter number=");
		int i=scn.nextInt();
		parameter_constructor pc=new parameter_constructor(i);
		System.out.println("enter char=");
		String s=scn.next();
		parameter_constructor pc1=new parameter_constructor(s);
		System.out.println("enter double value=");
		double d=scn.nextDouble();
		parameter_constructor pc2=new parameter_constructor(d);
	}
}
