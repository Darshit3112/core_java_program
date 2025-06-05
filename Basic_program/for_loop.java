package Basic_program;

public class for_loop 
{
	int n=3,c=1;
	public for_loop()
	{
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				c++;
			}
		}
		System.out.println(c);
		if(c>2)
		{
			System.out.println(n+" is not prime");
		}
		else
		{
			System.out.println(n+" is prime");
		}
	}
	
	 public static void main(String[] args) 
	 {
		new for_loop();
	 }
}
