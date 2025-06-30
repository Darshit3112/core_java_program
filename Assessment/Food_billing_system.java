package Assessment;

import java.util.Scanner;

public class Food_billing_system 
{
	String food_name[]= {"Pizza","Burger","Dosa","Idli"};
	int c=0;
	int total_bill_geneate[]=new int[4];
	int amount[]=new int[4];
	int quantity[]=new int[4];
	int total=0,pizza_total=0,dosa_total=0,idli_total=0,buger_total=0;
	String more_order,choice;
	Scanner scn= new Scanner(System.in);
    public Food_billing_system()
    {
    	
    	while(true)
    	{
    	System.out.println("------------MENU-------------");
    	System.out.println("1.Pizza  \t Price = 300rs");
    	System.out.println("2.Burger \t Price = 150rs");
    	System.out.println("3.Dosa   \t Price = 70rs");
    	System.out.println("4.Idli   \t Price = 60rs");
    	
    	System.out.println("Enter your choice.... :");
    	choice=scn.next();
    	switch (choice) 
    	{
		case "1":
			food_name[0]="Pizza";
			System.out.println("You have selected "+food_name[0]);
			System.out.println("Enter quantity=");
			quantity[0]=scn.nextInt();
			amount[0]=300;
			total_bill_geneate[0]=quantity[0] * amount[0];
			System.out.println("Total amount="+total_bill_geneate[0]);
			
			System.out.println("Do you want place more orders? yes & no:");
			more_order=scn.next();
			if(more_order.equalsIgnoreCase("yes"))
			{
				System.out.println();
			}
			else
			{
				System.out.println("Visit again");
				bill();
				return;
			}
			break;
		case "2":
			food_name[1]="Burger";
			System.out.println("You have selected "+food_name[1]);
			System.out.println("Enter quantity=");
			quantity[1]=scn.nextInt();
			total_bill_geneate[1]=150;
			amount[1]=150;
			total_bill_geneate[1]=quantity[1] * amount[1];
			System.out.println("Total amount="+total_bill_geneate[1]);
			
			System.out.println("Do you want place more orders? yes & no:");
			more_order=scn.next();
			if(more_order.equalsIgnoreCase("yes"))
			{
				System.out.println();
			}
			else
			{
				System.out.println("Visit again");
				bill();
				return;
			}
			break;
		case "3":
			food_name[2]="Dosa";
			System.out.println("You have selected "+food_name[2]);
			System.out.println("Enter quentity=");
			quantity[2]=scn.nextInt();
			amount[2]=70;
			total_bill_geneate[2]=quantity[2] * amount[2];
			System.out.println("Total amount="+total_bill_geneate[2]);
			
			System.out.println("Do you want place more orders? yes & no:");
			more_order=scn.next();
			if(more_order.equalsIgnoreCase("yes"))
			{
				System.out.println();
			}
			else
			{
				System.out.println("Visit again");
				bill();
				return;
				
			}
			break;
		case "4":
			food_name[3]="Idli";
			System.out.println("You have selected "+food_name[3]);
			System.out.println("Enter quentity=");
			quantity[3]=scn.nextInt();
			total_bill_geneate[3]=60;
			amount[3]=60;
			total_bill_geneate[3]=quantity[3] * amount[3];
			System.out.println("Total amount="+total_bill_geneate[3]);
			
			System.out.println("Do you want place more orders? yes & no:");
			more_order=scn.next();
			
			switch (more_order) {
			case "yes":
				System.out.println();
				
				break;
			case "no":
				bill();
				return;

			default:
				break;
			}
			break;
		case "5":
			for(int i=0;i<food_name.length;i++) {
				System.out.println(food_name[i]+" "+total_bill_geneate[i]);
			}
			break;
		default:
			System.out.println("Please select valid item");
			break;
		}
    	}
		
    }
    void bill()
    {
    	for(int i=0;i<food_name.length;i++)
    	{
    		System.out.println(food_name[i]+"\t"+amount[i]+"\t"+quantity[i]+"\t"+total_bill_geneate[i]);
    		c+=total_bill_geneate[i];
    	}
		System.out.println("total bill:"+c);
    }
	public static void main(String[] args) 
	{
		Food_billing_system fbs=new Food_billing_system();
	}
}
