package Basic_program;

import java.util.Scanner;

public class scanner1
{
	public scanner1()  //empty brackets=no parameters 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter number=");
		int i=scn.nextInt();
		System.out.println("Enter char=");
		String c=scn.next();
		System.out.println("Enter double value=");
		double d=scn.nextDouble();
		
		System.out.println(i+"\n"+c+"\n"+d);
	}
	public static void main(String[] args) 
	{
		scanner1 c=new scanner1();
	}
}
