package Encapsulation;

public class Call_bank 
{
	public static void main(String[] args) 
	{
		Bank b=new Bank();
		b.setAccountholderName("Shefali");
		b.setBalance(20000000);
		b.deposit(1000);
		b.withdrawal(100);
		b.showbal();
	}
}
