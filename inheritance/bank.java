package inheritance;

public class bank 
{
	int balance;
	void deposit(int amount)
	{
		balance=balance+amount;
		System.out.println("Balance="+balance);
	}
	void deposit(int amount,String name)
	{
		balance=balance+amount;
		System.out.println(balance+" deposit by "+name);
	}
	void deposit(int amount,String name, String bname)
	{
		balance=balance+amount;
		System.out.println(balance+" deposit by "+name+" in"+bname+" bank");
	}
	void deposit(int amount,String name, String bname,String branch)
	{
		balance=balance+amount;
		System.out.println(balance+" deposit by "+name+" in "+bname+" bank in"+branch+" branch");
	}
	void deposit(int amount,String name, String bname,String branch,double currency)
	{
		balance=balance+amount;
		double currency_display=amount/currency;
		System.out.println(balance+" deposit by "+name+" in "+bname+" bank in"+branch+" branch USD="+currency_display);
	}
	public static void main(String[] args) 
	{
		bank b=new bank();
		b.deposit(1000);
		b.deposit(10, "Darshit");
		b.deposit(5, "Shefali", "pnb");
		b.deposit(30, "ramesh", "bob", "dang");
		b.deposit(5000, "suresh", "canara", "vasad", 80);
	}
}
