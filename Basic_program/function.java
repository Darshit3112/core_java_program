package Basic_program;

import java.util.Scanner;

public class function 
{
	//make function no perameter no return
	void demo()
	{
		System.out.println("default method");
	}
	void demo(int i)
	{
		System.out.println(i);
	}
	public static void main(String[] args) 
	{
		function f=new function();
		Scanner scn=new Scanner(System.in);
		System.out.println("enter number=");
		int id=scn.nextInt();
		f.demo(id);
		f.demo();
		
		
		
		
	}
}
