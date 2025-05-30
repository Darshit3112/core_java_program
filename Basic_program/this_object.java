package Basic_program;

public class this_object 
{
	void demo()
	{
		System.out.println("default method");
	}
	void demo(int i)
	{
		this.demo();//demo()
		System.out.println(i);
	}
	void demo(String s)
	{
		this.demo(31);
		System.out.println(s);
	}
	public static void main(String[] args) 
	{
		this_object t=new this_object();
		t.demo("test");
	}
}
