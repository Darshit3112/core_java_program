package Basic_program;

import java.util.Scanner;

public class Constructor_class 
{
	int id;
	String name;
	public Constructor_class()
	{
		System.out.println("default constructor");
	}
	Constructor_class(int id,String name)
	{
		this.id=id;
		this.name=name;
		System.out.println(id+" "+name);
	}
	void display()
	{
		System.out.println(id+" "+name);
	}
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter number & char=");
		int id=scn.nextInt();
		String s=scn.next();
		Constructor_class c=new Constructor_class(id,s);
		c.display();
	}
}
