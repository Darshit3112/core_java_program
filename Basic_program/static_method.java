package Basic_program;

public class static_method 
{
	int id=11;
	static int a=10;
	void display()
	{
		System.out.println(id+" "+a);
	}
	static void static_1()
	{
		System.out.println(a);
	}
	public static void main(String[] args) 
	{
		static_method s=new static_method();
		s.display();
		static_1();
	}
}
