package Basic_program;

import java.util.Scanner;

public class class_object_constructor 
{
	public class_object_constructor() 
	{
		System.out.println("default constructor");
		// TODO Auto-generated constructor stub
	}
	class_object_constructor(int i)
	{
		System.out.println(i);
	}
	class_object_constructor(String s)
	{
		System.out.println(s);
	}
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter number=");
		int id=scn.nextInt();
		Scanner scn1=new Scanner(System.in);
		System.out.println("enter char=");
		String s=scn1.next();
		class_object_constructor co=new class_object_constructor();
		class_object_constructor co1=new class_object_constructor(id);
		class_object_constructor co2=new class_object_constructor(s);
	}
}
