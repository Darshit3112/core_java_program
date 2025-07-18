package Encapsulation;

public class Bank 
{
	private String accountholderName;
	private int Balance;
	
	public String getAccountholderName() 
	{
		return accountholderName;
	}
	public void setAccountholderName(String accountholderName) 
	{
		this.accountholderName = accountholderName;
	}
	public int getBalance() 
	{
		return Balance;
	}
	public void setBalance(int balance) 
	{
		this.Balance = balance;
	}
	
	void deposit(int amount)
	{
		Balance=Balance+amount;
	}
	
	void withdrawal(int amount)
	{
		Balance=Balance-amount;
	}
	
	void showbal()
	{
		System.out.println("Balance="+Balance);
	}
}
