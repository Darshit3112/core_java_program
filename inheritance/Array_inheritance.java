package inheritance;

import java.util.Scanner;

class admin
{
	int n;
	Scanner scn=new Scanner(System.in);
	int id[];
	String name[];
	
	public admin()
	{
		System.out.println("enter the size of array");
		n=scn.nextInt();
		id=new int[n];
		name=new String[n];
		System.out.println("enter the id and name of student");
		for(int i=0;i<n;i++)
		{
			id[i]=scn.nextInt();
			name[i]=scn.next();
		}
	}
	void display()
	{
		System.out.println("id\tname");
		for(int i=0;i<n;i++)
		{
			System.out.println(id[i]+"\t"+name[i]);
		}
	}
}
class student extends admin
{
	String subjects[];
	public student()
	{
		 subjects=new String[n];
		 System.out.println("enter the subjects");
		 for(int i=0;i<n;i++)
		 {
			 subjects[i]=scn.next();
		 }
	}
	void display()
	{
		super.display();
		System.out.println("subjects");
		for(int i=0;i<n;i++)
		{
			System.out.println(subjects[i]);
		}
	}
}
class marks extends student
{
	int marks[];
	public marks()
	{
		marks =new int[n];
		System.out.println("enter marks");
		for(int i=0;i<n;i++)
		{
			marks[i]=scn.nextInt();
		}
	}
	void display()
	{
		super.display();
		System.out.println("marks");
		for(int i=0;i<n;i++)
		{
			System.out.println(marks[i]);
		}
	}
}
public class Array_inheritance 
{
	public static void main(String[] args) 
	{
		marks m=new marks();
		m.display();
	}
}
