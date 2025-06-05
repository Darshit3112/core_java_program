package Basic_program;
class outer_class
{
	void outer_class_method()
	{
		System.out.println("outer class method");
	}
	static class inner_class
	{
		void inner_class_method()
		{
			System.out.println("inner class method");
		}
		static void inner_class_1()
		{
			System.out.println("static class method");
		}
	}
}

public class static_nestedclass 
{
	public static void main(String[] args) 
	{
		outer_class oc=new outer_class();
		oc.outer_class_method();
		outer_class.inner_class oi=new outer_class.inner_class();
		oi.inner_class_1();
	}
}
