package Exception;

public class Throw_throws 
{
	public Throw_throws() throws Exception 
	{
		int i=-10;
		if(i>0)
		{
			System.out.println("positive number");
		}
		else
		{
			throw new Exception("Negative number");
		}
	}
	public static void main(String[] args) throws Exception 
	{
		new Throw_throws();
	}
}