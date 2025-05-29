package Basic_program;

public class Constructor_class 
{
	int id;
	String name;
	public Constructor_class()
	{
		System.out.println("default constructor");
	}
	Constructor_class(int id,String name)
	{
		this.id=id;
		this.name=name;
		System.out.println(id+" "+name);
	}
	void display()
	{
		System.out.println(id+" "+name);
	}
	public static void main(String[] args) 
	{
		Constructor_class c=new Constructor_class(1,"test");
		c.display();
	}
}
