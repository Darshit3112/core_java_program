package Abstract;

public class Call_interface implements Datadao,Datadao1,Datadao2
{

	@Override
	public void demo() 
	{
		System.out.println("Hello");
	}
	public static void main(String[] args) 
	{
		Call_interface ci=new Call_interface();
		ci.demo();
		ci.demo1();
		ci.demo2();
	}
	@Override
	public void demo2() 
	{
		System.out.println("Hello2");
	}
	@Override
	public void demo1() 
	{
		System.out.println("Hello1");
	}

}
