package Basic_program;

public class static_keyword 
{
	static int counter=0;
	public static_keyword()
	{
		counter++;
		System.out.println(counter);
	}
	public static void main(String[] args) 
	{
		static_keyword s=new static_keyword();
		static_keyword s1=new static_keyword();
		static_keyword s2=new static_keyword();
	}
}
