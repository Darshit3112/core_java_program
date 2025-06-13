package inheritance;

import java.util.Scanner;

class parent_2
{
	static Scanner scn=new Scanner(System.in);
	void display(int a)
	{
		System.out.println("parent class display "+a);
	}
}
class child_2 extends parent_2
{
	void display(int a)
	{
		
		System.out.println("enter number=");
		int b=scn.nextInt();
		super.display(b);
		System.out.println("child class display "+a);
	}
}
public class method_overriding 
{
	public static void main(String[] args) 
	{
		System.out.println("enter number=");
		int a=parent_2.scn.nextInt();
		child_2 c=new child_2();
		c.display(a);
	}
}
