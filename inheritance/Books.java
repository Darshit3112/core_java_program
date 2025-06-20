package inheritance;

import java.util.Scanner;

public class Books 
{
	int price;
	String author;
	String title;
	static Scanner scn=new Scanner(System.in);
	public Books(String author,String title,int price) 
	{
		this.author=author;
		this.title=title;
		this.price=price;
	}
	void display()
	{
		System.out.println("The "+title+" is make by "+author+" and the book price is "+price);
	}
	public static void main(String[] args) 
	{
		System.out.println("enter the author=");
		String author=scn.nextLine(); 
		System.out.println("enter the title=");
		String title=scn.nextLine();
		System.out.println("enter the price=");
		int price=scn.nextInt();
		Books b=new Books(author,title,price);
		b.display();
	}
}

