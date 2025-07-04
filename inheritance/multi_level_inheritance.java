package inheritance;

import java.util.Scanner;

class Admin
{
	Scanner scn=new Scanner(System.in);
	int n;
	public Admin() 
	{
		System.out.println("Enter the number of student:");
		n=scn.nextInt();
	}
	void display()
	{
		System.out.println("Total student="+n);
	}
}
class Student extends Admin
{
	int id[];
	String name[];
	String address[];
	public Student() 
	{
		id=new int[n];
		name=new String[n];
		address=new String[n];
		System.out.println("enter id name and address");
		for(int i=0;i<n;i++)
		{	
			id[i]=scn.nextInt();
			name[i]=scn.next();
			address[i]=scn.next();
		}
	}
	void display()
	{
		for(int i=0;i<n;i++)
		{
			 
		}
	}
}
class Marks extends Student
{
	
}
public class multi_level_inheritance 
{
	public static void main(String[] args) 
	{
		
	}
}
