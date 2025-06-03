package Basic_program;

public class function1 
{
	void demo()
	{
		System.out.println("default method");
	}
	void demo(int i)
	{
		System.out.println(i);
	}
	void demo(String s)
	{
		System.out.println(s);
	}
	public static void main(String[] args) 
	{
		function1 f=new function1();
		f.demo();
		f.demo(10);
		f.demo("test");
	}
}
