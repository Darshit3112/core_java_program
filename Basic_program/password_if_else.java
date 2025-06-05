package Basic_program;

import java.util.Scanner;

public class password_if_else 
{
	public password_if_else()
	{
		Scanner scn=new Scanner(System.in);
		
		while(true)
		{
			System.out.println("enter password");
			String name=scn.next();
			if(name.equals("Admin123"))
			{
				System.out.println("correct password");
				break;
			}
			else
			{
				System.out.println("incorrect password");
			}
		}
	}
	public static void main(String[] args) 
	{
		new password_if_else();
	}
}
