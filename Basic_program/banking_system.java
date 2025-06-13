package Basic_program;

import java.util.Scanner;

public class banking_system 
{
	public banking_system() 
	{
		Scanner sc=new Scanner(System.in);
		int choice=0;
		int acc_no=0;
		int deposit_amount;
		String name=null;
		double balance=0;
		
			while(true)
			{
				System.out.println("enter your choice");
				choice=sc.nextInt();
				switch(choice)
				{
				case 1:
					System.out.println("enter your name");
					name=sc.next();
					System.out.println("enter your account number");
					acc_no=sc.nextInt();
					System.out.println("enter your balance");
					balance=sc.nextDouble();
					System.out.println("account created successfully!");
					break;
				
				case 2:
					System.out.println("enter the amount to deposit");
					deposit_amount=sc.nextInt();
					if(deposit_amount>0)
					{
						System.out.println("amount deposited successfully!");
					}
					else
					{
						System.out.println("invalid deposit amount.");
					}
					balance +=deposit_amount;
					break;
				
				case 3:
					System.out.println("enter the amount to withdraw");
					int withdraw_amount=sc.nextInt();
					if(withdraw_amount>0 && withdraw_amount<=balance)
					{
						balance -=withdraw_amount;
						System.out.println("amount withdrawn successfully!");
					}
					else 
					{
						System.out.println("invalid withdrawal amount.");
					}
					break;
				case 4:
					System.out.println("displaying account details");
					System.out.println("account number: "+ acc_no);
					System.out.println("account holding name: "+ name);
					System.out.println("current balance: "+ balance);
					break;
					
				case 5:
					System.out.println("exiting the banking system .thank you!");
					System.exit(0);
					break;
				}
			}
	}
	public static void main(String[] args) 
	{
		new banking_system();
	}
}
