package Exception;

public class try_catch 
{
	public static void main(String[] args) 
	{
		try
		{
			
			int i1=10;
			String str=String.valueOf(i1);
			System.out.println(str);
			try
			{
			
			
				try
				{
					int arr[]=new int [3];
					arr[5]=1;
				}
				catch(ArrayIndexOutOfBoundsException ai)
				{
					System.out.println(ai);
				}
				int a=10;
				int b=a/0;
			}
			catch(ArithmeticException e)
			{
				System.out.println(e);
			}
			String s="abc";
			int i=Integer.parseInt(s);
			System.out.println(i);
		}
		catch(NumberFormatException ex)
		{
			System.out.println(ex);
		}
		System.out.println("test");
	}
}
