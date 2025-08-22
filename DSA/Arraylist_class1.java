package DSA;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist_class1 
{
	int id;
	String name;
	public Arraylist_class1(int id,String name) 
	{
		this.id=id;
		this.name=name;
	}
	
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		ArrayList<Arraylist_class1> al=new ArrayList<Arraylist_class1>();
		int choice=0;
		int studentnumber=0;
		do
		{
			System.out.println("1:Add student data");
			System.out.println("2:Display student data");
			System.out.println("3:Search student data");
			System.out.println("4:Remove student data");
			System.out.println("5:Exit");
			
			System.out.println("Enter choice");
			choice=scn.nextInt();
			switch (choice)
			{
			case 1:
				System.out.println("How many student data do you want");
				studentnumber=scn.nextInt();
				System.out.println("Enter id and1 name");
				for(int i=0;i<studentnumber;i++)
				{
					int id=scn.nextInt();
					String name=scn.next();
					al.add(new Arraylist_class1(id, name));
				}
				break;
			case 2:
				System.out.println("Student entry");
				for(Arraylist_class1 arr:al)
				{
					System.out.println(arr.id+" "+arr.name);
				}
				break;
			case 3:
				System.out.println("Search student data");
				System.out.println("Enter student id");
				int id=scn.nextInt();
				for(Arraylist_class1 ar:al)
				{
					if(id==ar.id)
					{
						System.out.println(ar.id+" "+ar.name);
						break;
					}
				}
				break;
			case 4:
				System.out.println("remove student data");
				System.out.println("enter student id");
				int d_id=scn.nextInt();
				for(int i=0;i<al.size();i++)
				{
					if(d_id==al.get(i).id)
					{
						al.remove(i);
						System.out.println("student data removed");
						System.out.println("updated student data");
						for(Arraylist_class1 arr:al)
						{
							System.out.println(arr.id+" "+arr.name);
						}
					}	
				}
			default:
				break;
			}
			
		}
		while(choice!=5);
	}
}
