package inheritance;

import java.util.Scanner;

class Person
{
	Scanner scn=new Scanner(System.in);
	String name;
	int age;
	
	void displayPersonDetails()
	{
		System.out.println("Enter name:");
		name=scn.next();
		System.out.println("Enter age:");
		age=scn.nextInt();
		
		System.out.println("Name="+name+" Age="+age);
	}
}
class employee extends Person
{
	int empid;
	String department;
	void displayemployeedetails()
	{
		super.displayPersonDetails();
		System.out.println("Enter department:");
		department=scn.next();
		System.out.println("Enter empid:");
		empid=scn.nextInt();
		
		System.out.println("Department="+department+" Employee id="+empid);
	}
}
class manager extends employee
{
	int teamsize;
	void displaymanagerDetails()
	{
		super.displayemployeedetails();
		System.out.println("Enter teamsize:");
		teamsize=scn.nextInt();
		
		System.out.println("teamsize="+teamsize);
	}
}
public class Task 
{
	public static void main(String[] args) 
	{
		manager m=new manager();
		m.displaymanagerDetails();
	}
}
