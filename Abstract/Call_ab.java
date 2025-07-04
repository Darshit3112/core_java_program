package Abstract;

public class Call_ab extends Abstract_class
{

	@Override
	void method1() 
	{
		System.out.println("method1");
	}

	@Override
	void method1(int i)
	{
		System.out.println(i);
	}

	public static void main(String[] args) 
	{
		Call_ab c=new Call_ab();
		c.method1();
		c.method1(10);
	}
}
