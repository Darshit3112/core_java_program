package Basic_program;

public class function 
{
	//make function no perameter no return
	void demo()
	{
		System.out.println("default method");
	}
	void demo(int i)
	{
		System.out.println(i);
	}
	public static void main(String[] args) 
	{
		function co=new function();
		co.demo();//function call
		co.demo(10);
	}
}
