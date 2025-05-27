package Basic_program;

import java.util.Scanner;

public class Test1
{
	public static void main(String[] args) 
	{
		int i,i1;
		double d;
		String s;
		
		Scanner scn=new Scanner(System.in);
		System.out.println("enter int:");
		i=scn.nextInt();
		i1=scn.nextInt();
		System.out.println("enter string:");
		s=scn.next();
		System.out.println("enter double");
		d=scn.nextDouble();
		System.out.println(i+"\n"+i1+"\n"+s+"\n"+d);
	}
}
