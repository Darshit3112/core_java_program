package inheritance;

class parent
{
	int a=10;
	public parent()
	{
		System.out.println("parent class constructor");
	}
}
class child extends parent
{
	public child()
	{
		System.out.println("child class contructor");
		System.out.println("a="+a);
	}
}
public class Single_level 
{
	public static void main(String[] args) 
	{
		child c=new child();
	}
}
