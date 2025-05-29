package Basic_program;

public class overloading_class_object 
{
	public overloading_class_object()
	{
		System.out.println("default constructor");
	}
	overloading_class_object(int i)
	{
		this();
		System.out.println(i);
	}
	overloading_class_object(String s)
	{
		this(12);
		System.out.println(s);
	}
	public static void main(String[] args) 
	{
		new overloading_class_object("test");
	}
}
