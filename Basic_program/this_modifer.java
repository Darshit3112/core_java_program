package Basic_program;

public class this_modifer 
{
	int id;
	String name;
	public this_modifer(int id, String name) 
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
		this_modifer tm=new this_modifer(10, "test");
		tm.display();
	}
}
