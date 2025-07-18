package Exception;
public class Odd_even_exception 
{
	public Odd_even_exception() throws Exception 
	{
		int num=-11;
		if(num>0 && num%2==0)
		{
			System.out.println("even");
		}
		else if(num>0 && num%2!=0)
		{
			System.out.println("odd");
		}
		else
		{
			throw new Exception("invalid number");
		}
	}
	public static void main(String[] args) throws Exception 
	{
		new Odd_even_exception();
	}
}
