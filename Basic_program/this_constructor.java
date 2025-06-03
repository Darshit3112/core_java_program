package Basic_program;

public class this_constructor 
{
	public this_constructor() 
	{
		System.out.println("default");
	}
	this_constructor(int i)
	{
		this();
		System.out.println(i);
	}
	this_constructor(String s)
	{
		this(10);
		System.out.println(s);
	}
	public static void main(String[] args) 
	{
		this_constructor tc=new this_constructor("test");
	}
}
