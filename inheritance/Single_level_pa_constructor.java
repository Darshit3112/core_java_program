package inheritance;

class parent_1
{
	int a,b;
	public parent_1(int a,int b)
	{
		this.a=a;
		this.b=b;
		System.out.println("parent class "+a+" "+b);
	}
	void demo()
	{
		System.out.println("demo "+a+" "+b);
	}
}
class child_1 extends parent_1
{
	public child_1(int a,int b)
	{
		super(10,20);
		super.demo();
		System.out.println(a+" "+b);
	}
}
public class Single_level_pa_constructor 
{
	public static void main(String[] args) 
	{
		child_1 c=new child_1(10,20);
	}
}
