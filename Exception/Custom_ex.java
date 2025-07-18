package Exception;

class Insufficientbalanceexception extends Exception
{

	public Insufficientbalanceexception(String string) 
	{
		super(string);
	}
	
}

public class Custom_ex 
{
	int withdraw=10000;
	int balance=5000;
	public Custom_ex() throws Insufficientbalanceexception 
	{
		if(withdraw<balance)
		{
			balance=balance-withdraw;
			System.out.println("withdraw successfull, balance="+balance);
		}
		else
		{
			throw new Insufficientbalanceexception("insufficient balance");
		}
	}
	
	public static void main(String[] args) throws Insufficientbalanceexception 
	{
		Custom_ex c=new Custom_ex();
	}
}
