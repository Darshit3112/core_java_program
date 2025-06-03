package Basic_program;

public class this_function 
{
	void demo()
	{
		System.out.println("default");
	}
	void demo(int i)
	{
		this.demo();
		System.out.println(i);
	}
	void demo(String s)
	{
		this.demo(20);
		System.out.println(s);
	}
	public static void main(String[] args) 
	{
		this_function tf=new this_function();
		tf.demo("test");
	}
}
