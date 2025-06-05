package Basic_program;

public class static_variable 
{
	int id;
	String name;
	static String college="DNICA";
	public static_variable(int id,String name) 
	{
		 this.id=id;
		 this.name=name;
		 
	}
	void display()
	{
		System.out.println(id+" "+name+" "+college);
	}
	public static void main(String[] args) 
	{
		static_variable s=new static_variable(1, "DVP");
		static_variable s1=new static_variable(2, "test");
		s.display();
		s1.display();
	}
}
